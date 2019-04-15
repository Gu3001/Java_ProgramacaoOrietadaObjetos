package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection con;
	
	public static Connection get() throws SQLException{
		if(con == null) {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC","root","");
		}return con;
	}
	
	
}
