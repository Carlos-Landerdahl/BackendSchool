import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import java.sql.*;

public class Main {

    private static final String sqlCreatTable = "DROP TABLE IF EXISTS Funcionario; CREATE TABLE Funcionario"
            + "("
            + " Id INT PRIMARY KEY,"
            + " Nome VARCHAR(100) NOT NULL,"
            + " Sobrenome VARCHAR(100) NOT NULL,"
            + " Idade INT NOT NULL,"
            + " Cidade VARCHAR(30) NOT NULL"
            + ")";


    private static final String sqlInsert1 = "INSERT INTO Funcionario (Id, Nome, Sobrenome, Idade, Cidade) " +
            "VALUES (1, 'Carlos', 'Roberto', 22, 'UDI')";
    private static final String sqlInsert2 = "INSERT INTO Funcionario (Id, Nome, Sobrenome, Idade, Cidade) " +
            "VALUES (2, 'Caio', 'Nunes', 24, 'SP')";
    private static final String sqlInsert3 = "INSERT INTO Funcionario (Id, Nome, Sobrenome, Idade, Cidade) " +
            "VALUES (2, 'Michel', 'Roberto', 22, 'GO')";
    private static final String sqlInsert4 = "INSERT INTO Funcionario (Id, Nome, Sobrenome, Idade, Cidade) " +
            "VALUES (4, 'João', 'Silva', 12, 'BA')";

    private static final String sqlUpdate1 = "UPDATE Funcionario SET Nome = 'Lucas' WHERE Id = 1";

    private static final String sqlDelete = "DELETE FROM Funcionario WHERE Id = 4";

    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = getConexao();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreatTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            try{
                statement.execute(sqlInsert3);
            } catch (JdbcSQLIntegrityConstraintViolationException e) {
                System.out.println(e.getMessage());
            }
            statement.execute(sqlInsert4);
            statement.execute(sqlUpdate1);
            statement.execute(sqlDelete);

            mostrar(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void mostrar(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Funcionario";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " - "
                    + resultSet.getString(2) + " - "
                    + resultSet.getString(3) + " - "
                    + resultSet.getInt(4) + " - "
                    + resultSet.getString(5)
            );
        }
    }

    public static Connection getConexao() throws Exception {

        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}