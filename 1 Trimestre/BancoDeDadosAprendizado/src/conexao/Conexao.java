package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//static limita o acesso, acessa um �nico m�todo, para evitar sobrecarga de acesso

public class Conexao {
	private static String url ="jdbc:mysql://localhost:3306/bancoteste?useTimezone=true&serverTimezone=UTC";
	private static String usuario ="root";
	private static String senha ="";
	private static Connection conn; //delarando conexao
	
	public static Connection get() { //m�todo de conexao
		try {
			if(conn == null) {//cria na primeira vez, se outro usuario acessar, s� vai retornar o que j� est� aberto
				conn = DriverManager.getConnection(url,usuario,senha);//crio a conexao se n�o existe, caso contr�rio eu s� retorno
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
}
