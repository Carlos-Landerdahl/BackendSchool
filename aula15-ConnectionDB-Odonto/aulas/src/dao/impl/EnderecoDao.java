package dao.impl;

import config.ConfiguracaoJDBC;
import dao.IDao;
import model.Endereco;
import model.Paciente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EnderecoDao implements IDao<Endereco> {

    private ConfiguracaoJDBC configuracaoJDBC;

    private final static Logger log = Logger.getLogger(String.valueOf(Paciente.class));

    public EnderecoDao(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Endereco salvar(Endereco endereco) throws SQLException {
        log.info("Registrando endereço novo: " + endereco.toString());
        Connection connection = configuracaoJDBC.conectarBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO endereco (" +
                        "rua, " +
                        "numero, " +
                        "cidade, " +
                        "bairro, " +
                        ") VALUES ('%s', '%s', '%s', '%s')",
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getCidade(),
                endereco.getBairro()
        );
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = statement.getGeneratedKeys();

            if(generatedKeys.next()){
                endereco.setId(generatedKeys.getInt(1));
                log.info("Endereço registrado: " + endereco.toString());
                statement.close();
                connection.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return endereco;
    }
    @Override
    public List<Endereco> mostrar() throws SQLException {
        Connection connection = configuracaoJDBC.conectarBancoDeDados();
        String consult = "SELECT * FROM endereco";
        List<Endereco> enderecos = new ArrayList<>();

        try {
            PreparedStatement checkStatement = connection.prepareStatement(consult);
            ResultSet res = checkStatement.executeQuery(consult);

            while(res.next()){
                log.info(res.getInt(1)
                        + res.getString(2)
                        + res.getString(3)
                        + res.getString(4)
                        + res.getString(5)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return enderecos;
    }

    @Override
    public Paciente excluir(Integer id) throws SQLException {
        Connection connection = configuracaoJDBC.conectarBancoDeDados();
        String consult = "SELECT ? FROM endereco";
        String query = "DELETE FROM endereco WHERE id = ?";


        try{
            PreparedStatement checkStatement = connection.prepareStatement(consult);
            checkStatement.setInt(1, id);
            ResultSet res = checkStatement.executeQuery();

            if(res.next()){
                PreparedStatement deleteStatement = connection.prepareStatement(query);
                deleteStatement.setInt(1, id);
                deleteStatement.executeUpdate();

            } else {
                log.info("ID " + id + " não existe na tabela endereço.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
