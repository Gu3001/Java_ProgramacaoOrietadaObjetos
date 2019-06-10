package banco;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private static Connection conn;
	private static String url = "jdbc:mysql://localhost:3306/banco?serverTimezone=UTC";
	private static String usuario = "root";
	private static String senha = "";

	public static Connection get() {
		try {
			if (conn == null) {
				conn = DriverManager.getConnection(url, usuario, senha);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
