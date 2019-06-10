package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;

import entidade.Cliente;

public class DAOCliente {
	public Connection con;
	public void inserir(Cliente cli) throws SQLException{
		con = Conexao.get();
		Statement stm = con.createStatement();
		try {
			stm.executeUpdate("INSERT INTO CLIENTE(NOME) VALUES('"+cli.getNome()+"')");
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			con.close();
		}	
	}
	public void alterar(Cliente cli) throws SQLException{
		con = Conexao.get();
		Statement stm = con.createStatement();
		try {
			stm.executeLargeUpdate("UPDATE CLIENTE SET NOME ='"+cli.getNome()+"' WHERE ID = "+cli.getId()+" ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			con.close();
		}	
	}
	public ResultSet listar() throws SQLException{
		con = Conexao.get();
		Statement stm = con.createStatement();
		try {
			ResultSet rs = stm.executeQuery("Select * from CLIENTE;");
			return rs;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			con.close();
		}	
	}
	public void deletar(Cliente cli) throws SQLException{
		con = Conexao.get();
		Statement stm = con.createStatement();
		try {
			stm.executeUpdate("DELETE FROM CLIENTE WHERE ID = "+cli.getId()+" ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			con.close();
		}	
	}
	
	
}
