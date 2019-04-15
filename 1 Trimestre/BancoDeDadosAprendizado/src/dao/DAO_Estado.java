package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import entidade.Estado;

import conexao.Conexao;

public class DAO_Estado {
	private Connection conn = Conexao.get(); //definindo que conexao CONN é da outra classe separada, .get()	
//	private Statement st = conn.createStatement();
	
	
	public boolean inserir(Estado estado) {
		try {
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO ESTADO(NOME,SIGLA) VALUES('"+estado.getNome()+"','"+estado.getSigla()+"')");
			System.out.println("Salvo com sucesso");
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean excluir(Estado estado) {
		try {
			Statement st = conn.createStatement();
			st.executeUpdate("DELETE FROM ESTADO WHERE ID ='"+estado.getId()+"'");
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean alterar(Estado estado) {
		try {
			Statement st = conn.createStatement();
			st.executeUpdate("UPDATE ESTADO SET NOME ='"+estado.getNome()+"', SIGLA = '"+estado.getSigla()+"' WHERE ID ='"+estado.getId()+"'");
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public ResultSet consultar() {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM ESTADO");
			return rs;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	
}
