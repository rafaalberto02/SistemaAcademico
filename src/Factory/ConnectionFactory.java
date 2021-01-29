package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    static private Connection connection;

    public ConnectionFactory() {
        ConnectionFactory.connection = null;
    }

    public static Connection getConnection() {

        final String DB_NAME = "SistemaAcademico";
        final String USER = "root";
        final String PASS = "";

        final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;

        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static boolean closeConnection() {
        try {
            getConnection().close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
