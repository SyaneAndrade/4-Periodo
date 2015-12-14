import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection connection() throws SQLException, ClassNotFoundException{
		
		Class.forName("org.postgresql.Driver");
		
		String url= "jdbc:postgresql://localhost:5432/Emissora";
		String user= "******";
		String password= "*****";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;

	}
}

