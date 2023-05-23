package com.dh.dao.impl;

import com.dh.config.ConfiguracaoJDBC;
import com.dh.dao.IDao;
import com.dh.model.Medicamento;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class MedicamentoDao  implements IDao<Medicamento> {
    private ConfiguracaoJDBC configuracaoJDBC;

    private final static Logger log = Logger.getLogger(String.valueOf(Medicamento.class));

    public MedicamentoDao(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        log.info("Registrando medicamento novo: " + medicamento.toString());

        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;

        String query = String.format("INSERT INTO medicamento" +
                        "(nome, laboratorio, quantidade, preco) " +
                        "VALUES ('%s', '%s', '%s', '%s')",
                medicamento.getNome(),
                medicamento.getLaboratorio(),
                medicamento.getQuantidade(),
                medicamento.getPreco());

        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if(generatedKeys.next()) {
                medicamento.setId(generatedKeys.getInt(1));
                log.info("Registrando ID no novo medicamento: " + medicamento.toString());
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamento;
    }
}
