package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class SelecionarTodos {
	public void selecionarTodosDados() {
		InputDeDados inserir = new InputDeDados();
		
		
		String url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
		
		String user = "root";
		
		try {
			
		Connection conn = DriverManager.getConnection(url, user,"");
		Statement st = conn.createStatement();
		
		
		ResultSet rs = st.executeQuery("SELECT * FROM CLIENTE");
		String resultado = "";
		while(rs.next()) {
			resultado += rs.getString("nome")+"\n";
		}
		JOptionPane.showMessageDialog(null, resultado);

			
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
}
