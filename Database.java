import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String url = "jdbc:mysql://localhost:3307/store";
            String username = "root";
            String password = "pass";
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

}
