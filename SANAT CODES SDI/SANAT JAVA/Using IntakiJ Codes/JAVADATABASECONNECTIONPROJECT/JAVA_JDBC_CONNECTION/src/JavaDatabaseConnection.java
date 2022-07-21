import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDatabaseConnection {
    public static void main(String[] args) {
        String url="jdbc:sqlserver://LAPTOP-8QNOGTH9;databaseName=sanat";
        String user="sa";
        String password ="User@1";

        try {
            Connection connection= DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
