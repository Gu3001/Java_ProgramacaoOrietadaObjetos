package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Alterar {
	public void alterarCadastro() {
		
		String url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
		
		String user = "root";
		
		try {
			Connection conn = DriverManager.getConnection(url, user,"");
			Statement st = conn.createStatement();
			
			InputDeDados inserir = new InputDeDados();
			String nomeAntigo = inserir.inserirNomeAntigo();
			String nomeNovo = inserir.inserirNome();
			
			st.executeUpdate("UPDATE CLIENTE SET NOME = '"+nomeNovo+"' WHERE NOME = '"+nomeAntigo+"'");
			
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
}
