package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Inserir {
	public void inserirDados() {
		InputDeDados inserir = new InputDeDados();
		
		
		String url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
		
		String user = "root";
		
		try {
			
		Connection conn = DriverManager.getConnection(url, user,"");
		Statement st = conn.createStatement();
		
		
		
		String resposta = "s";
		while(resposta.equals("s")){
			
	
			if (resposta.equals("n")){
				break;
			}
			String nome = inserir.inserirNome();
			int rg = inserir.inserirRG();
			int cpf = inserir.inserirCPF();
			int telefone = inserir.inserirTelefone();
			resposta = inserir.inserirResposta();
						
			st.executeUpdate("INSERT INTO CLIENTE(NOME,RG,CPF,TELEFONE) VALUES('"+nome+"','"+rg+"','"+cpf+"','"+telefone+"')");
	
		}

			

		}catch(Exception e) {
			e.printStackTrace();

		}
	}
}
