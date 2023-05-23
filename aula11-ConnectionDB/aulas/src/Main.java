import java.sql.*;

public class Main {

    private static final String sqlCreatTable = "DROP TABLE IF EXISTS Geometria; CREATE TABLE Geometria"
            + "("
            + " Id INT PRIMARY KEY,"
            + " Nome VARCHAR(100) NOT NULL,"
            + " Cor VARCHAR(100) NOT NULL"
            +")";


    private static final String sqlInsert1 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (1, 'Quadrado', 'Verde')";
    private static final String sqlInsert2 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (2, 'Quadrado', 'Vermelho')";
    private static final String sqlInsert3 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (3, 'Quadrado', 'Amarelo')";
    private static final String sqlInsert4 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (4, 'Circulo', 'Branco')";
    private static final String sqlInsert5 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (5, 'Circulo', 'Vermelho')";


    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = getConexao();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreatTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);

            mostrar(connection);



        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    private static void mostrar(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Geometria WHERE Cor = 'Vermelho' ";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }
    }

    public static Connection getConexao() throws Exception {

        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}