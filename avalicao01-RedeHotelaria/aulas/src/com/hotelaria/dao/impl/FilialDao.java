package com.hotelaria.dao.impl;

import com.hotelaria.config.ConfiguracaoJDBC;
import com.hotelaria.dao.IDao;
import com.hotelaria.model.FilialHotel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FilialDao implements IDao<FilialHotel> {
    private ConfiguracaoJDBC configuracaoJDBC;
    private static final Logger log = Logger.getLogger(FilialHotel.class.getName());
    public FilialDao(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }
    @Override
    public FilialHotel salvar(FilialHotel filialHotel) throws SQLException {
        Connection connection = configuracaoJDBC.conectarBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO Filiais (" +
                        "nomeFilial, " +
                        "rua, " +
                        "numero, " +
                        "cidade, " +
                        "estado, " +
                        "cincoEstrelas " +
                        ") VALUES ('%s', '%s', %d, '%s', '%s', %b)",
                filialHotel.getNomeFilial(),
                filialHotel.getRua(),
                filialHotel.getNumero(),
                filialHotel.getCidade(),
                filialHotel.getEstado(),
                filialHotel.getCincoEstrelas()
        );

        try {
           statement = connection.createStatement();
           statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next()) {
                filialHotel.setId(keys.getInt(1));
                log.info("Filial registrada com sucesso: " + filialHotel.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
            return filialHotel;
    }

    @Override
    public List<FilialHotel> mostrar() throws SQLException {
        List<FilialHotel> filiais = new ArrayList<>();
        Connection connection = configuracaoJDBC.conectarBancoDeDados();
        Statement statement = null;
        String query = "SELECT * FROM Filiais";
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                FilialHotel filial = new FilialHotel();
                filial.setId(resultSet.getInt("id"));
                filial.setNomeFilial(resultSet.getString("nomeFilial"));
                filial.setRua(resultSet.getString("rua"));
                filial.setNumero(resultSet.getInt("numero"));
                filial.setCidade(resultSet.getString("cidade"));
                filial.setEstado(resultSet.getString("estado"));
                filial.setCincoEstrelas(resultSet.getBoolean("cincoEstrelas"));

                String output = String.format(
                        "ID: %d, Nome da Filial: %s, Rua: %s, Número: %d, Cidade: %s, Estado: %s, Cinco Estrelas: %b",
                        filial.getId(), filial.getNomeFilial(), filial.getRua(),
                        filial.getNumero(), filial.getCidade(), filial.getEstado(),
                        filial.getCincoEstrelas()
                );
                log.info(output);

                filiais.add(filial);
            }
        } catch (SQLException e){
            log.severe(e.getMessage());
        } finally {
            connection.close();
        }
        return filiais;
    }
}
