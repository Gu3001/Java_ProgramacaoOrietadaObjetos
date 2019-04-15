package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Deletar {
	public void deletarCadastro() {
		
		
		String url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
		
		String user = "root";
		
		try {
			
		Connection conn = DriverManager.getConnection(url, user,"");
		Statement st = conn.createStatement();
		
		InputDeDados inserir = new InputDeDados();
		String nomeExcluir = inserir.inserirNomes();
		st.executeUpdate("DELETE FROM CLIENTE WHERE NOME = '"+nomeExcluir+"'");
			
	
			
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
}
