package dao.impl;

import config.ConfiguracaoJDBC;
import dao.IDao;
import model.Paciente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PacienteDao implements IDao<Paciente> {
    private ConfiguracaoJDBC configuracaoJDBC;

    private final static Logger log = Logger.getLogger(String.valueOf(Paciente.class));

    public PacienteDao(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Paciente salvar(Paciente paciente) throws SQLException {
        log.info("Registrando paciente novo: " + paciente.toString());
        Connection connection = configuracaoJDBC.conectarBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO paciente (" +
                "nome, " +
                "sobrenome, " +
                "rg, " +
                "dataCadastro, " +
                "idEndereco " +
                 ") VALUES ('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(),
                paciente.getSobreNome(),
                paciente.getRg(),
                paciente.getDataCadastro(),
                paciente.getEndereco().getId()
                );
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = statement.getGeneratedKeys();

            if(generatedKeys.next()){
                paciente.setId(generatedKeys.getInt(1));
                log.info("Paciente registrado com sucesso: " + paciente.toString());
                statement.close();
                connection.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return paciente;
    }

    @Override
    public List<Paciente> mostrar() throws SQLException {
        Connection connection = configuracaoJDBC.conectarBancoDeDados();
        String consult = "SELECT * FROM paciente";
        List<Paciente> pacientes = new ArrayList<>();

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
        return pacientes;
    }

    @Override
    public Paciente excluir(Integer id) throws SQLException {
        Connection connection = configuracaoJDBC.conectarBancoDeDados();
        String consult = "SELECT ? FROM paciente";
        String query = "DELETE FROM paciente WHERE id = ?";


        try{
            PreparedStatement checkStatement = connection.prepareStatement(consult);
            checkStatement.setInt(1, id);
            ResultSet res = checkStatement.executeQuery();

            if(res.next()){
                PreparedStatement deleteStatement = connection.prepareStatement(query);
                deleteStatement.setInt(1, id);
                deleteStatement.executeUpdate();

            } else {
                log.info("ID " + id + " não existe na tabela clinica.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
