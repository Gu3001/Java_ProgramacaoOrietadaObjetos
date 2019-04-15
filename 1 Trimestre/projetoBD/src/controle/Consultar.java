package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Consultar {
	public void consultarCadastro() {
		
		
		String url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
		
		String user = "root";
		
		try {
			Connection conn = DriverManager.getConnection(url, user,"");
			Statement st = conn.createStatement();
			
			InputDeDados inserir = new InputDeDados();
			String nomeExcluir = inserir.inserirNome();

			
			ResultSet rs = st.executeQuery("SELECT NOME,RG,cpf,telefone FROM CLIENTE WHERE NOME = '"+nomeExcluir+"'");
			String resultado = "";
			while(rs.next()) {
				resultado += rs.getString("nome")+" RG: ";
				resultado += rs.getInt("rg")+" CPF: ";
				resultado += rs.getInt("cpf")+" TELEFONE: ";
				resultado += rs.getInt("telefone")+" \n";
			}
			JOptionPane.showMessageDialog(null, resultado);
			
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
}
