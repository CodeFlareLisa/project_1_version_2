package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection connection = null;  // singleton
            // responsible for returning connection class objects
    private ConnectionFactory() {
        // default constructor
    }

    public static Connection getConnection()  {
        if (connection == null) {
            String url = "jdbj:mysql://localhost:3306/projone2";
            String username = "root";
            String password = "passworD@";
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}