import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String[] args) throws ClassNotFoundException {
        try (final Connection connection =
                    DriverManager.getConnection("jdbc:postgresql://pg-1b12671e-rodrigues2k04-0761.f.aivencloud.com:25675/defaultdb?ssl=require&user=avnadmin&password=AVNS_VXpj8JvBE62_aFNFGPq");
            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("SELECT version()")) {

        while (resultSet.next()) {
            System.out.println("Version: " + resultSet.getString("version"));
        }
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}