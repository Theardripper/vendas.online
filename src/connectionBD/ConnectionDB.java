package connectionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/vendas";
    private static final String USER = "postgres";
    private static final String PASSWORD = "231299";

    public static Connection connect()  throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
