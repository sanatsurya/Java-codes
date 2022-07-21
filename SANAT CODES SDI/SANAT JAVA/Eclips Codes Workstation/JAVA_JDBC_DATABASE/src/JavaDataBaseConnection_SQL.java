import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDataBaseConnection_SQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="jdbc://sqlserver:\\LAPTOP-8QNOGTH9;databaseName=sanat";
		String username="sa";
		String password ="User@1";
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
