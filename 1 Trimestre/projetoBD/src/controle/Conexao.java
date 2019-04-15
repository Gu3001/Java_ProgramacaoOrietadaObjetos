package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {
	public static void main(String[] args) {
		Connection conn = DriverManager.getConnection("")
		Statement st = conn.createStatement();
		st.executeQuery()
	}
}
