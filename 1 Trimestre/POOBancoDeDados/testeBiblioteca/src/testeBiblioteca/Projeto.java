package testeBiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import controle.VerificarPar;

public class Projeto {
	public static void main(String[] args) {
		
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
			String nome = JOptionPane.showInputDialog("Insira seu Nome");
			String rg = JOptionPane.showInputDialog("Insira o seu rg");
			String cpf = JOptionPane.showInputDialog("Insira o seu cpf");
			String telefone = JOptionPane.showInputDialog("Insira seu telefone");
			resposta = JOptionPane.showInputDialog("Insira sua resposta S ou N");
			
			
			
			st.executeUpdate("INSERT INTO CLIENTE(NOME,RG,CPF,TELEFONE) VALUES('"+nome+"','"+rg+"','"+cpf+"','"+telefone+"')");
	

		}
		
		//-----------------------------------------------------------------------------
//		ResultSet rs = st.executeQuery("SELECT * FROM CLIENTE");
//		String resultado = "";
//		while(rs.next()) {
//			resultado += rs.getString("nome")+"\n";
//		}
//		JOptionPane.showMessageDialog(null, resultado);
		//-------------------------EXCLUIR-----------------------------------------------
		String nomeExcluir = JOptionPane.showInputDialog("Insira seu Nome para excluir: ");
		st.executeUpdate("DELETE FROM CLIENTE WHERE NOME = '"+nomeExcluir+"'");
		
			
		//---------------------------ALTERAR--------------------------------------------------
		
		String nomeAntigo = JOptionPane.showInputDialog("Insira o nome para ser alterado: ");
		String nomeNovo = JOptionPane.showInputDialog("Insira o novo nome: ");
		st.executeUpdate("UPDATE CLIENTE SET NOME = '"+nomeNovo+"' WHERE NOME = '"+nomeAntigo+"'");
		

//		
		//-----------------------CONSULTAR------------------------------------------------------
		ResultSet rs = st.executeQuery("SELECT NOME,RG,cpf,telefone FROM CLIENTE WHERE NOME = 'christian'");
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
//categoria, deseja inserir outro???, id nome descição