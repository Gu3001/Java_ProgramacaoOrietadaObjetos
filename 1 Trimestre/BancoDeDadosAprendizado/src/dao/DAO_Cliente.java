package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import entidade.Cliente;

import conexao.Conexao;

public class DAO_Cliente {
	private Connection conn = Conexao.get(); //definindo que conexao CONN é da outra classe separada, .get()	
//	private Statement st = conn.createStatement();
	
	
	public boolean inserir(Cliente cliente) {
		try {
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO CLIENTE(NOME,RG,CPF,TELEFONE) VALUES('"+cliente.getNome()+"','"+cliente.getRg()+"','"+cliente.getCpf()+"','"+cliente.getTelefone()+"')");
			System.out.println("Salvo com sucesso");
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean excluir(Cliente cliente) {
		try {
			Statement st = conn.createStatement();
			st.executeUpdate("DELETE FROM CLIENTE WHERE ID ='"+cliente.getId()+"'");
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean alterar(Cliente cliente) {
		try {
			Statement st = conn.createStatement();
			st.executeUpdate("UPDATE CLIENTE SET NOME ='"+cliente.getNome()+"', RG = '"+cliente.getRg()+"', RG = '"+cliente.getCpf()+"', RG = '"+cliente.getTelefone()+"' WHERE ID ='"+cliente.getId()+"'");
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public ResultSet consultar() {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM CLIENTE");
			return rs;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	
}
