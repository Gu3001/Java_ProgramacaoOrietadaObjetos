package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entidade.Clientes;
import fabrica.Fabrica;
 
public class DAOGeneration {
	
	public Connection con;
	
	public void salvar(Clientes cli) throws SQLException {
		con = Fabrica.get();
		Statement stm = con.createStatement();
		try {
			stm.executeUpdate("INSERT INTO cliente (NOME, RG, CPF, ENDERECO, NUMERO, TELEFONE) VALUES('"+cli.getNome()+"', '"+cli.getRg()+"', '"+cli.getCpf()+"', '"+cli.getEndereco()+"', '"+cli.getNumero()+"', '"+cli.getTelefone()+"')");
		}catch(Exception e) {
			e.printStackTrace();
		}finally { 
			con.close();
		}
	}
	public void alterar(Clientes cli) throws SQLException {
		con = Fabrica.get();
		Statement stm = con.createStatement();
		try {
			stm.executeLargeUpdate("UPDATE CLIENTE SET NOME='"+cli.getNome()+"',RG='"+cli.getRg()+"',CPF='"+cli.getCpf()+"', ENDERECO='"+cli.getEndereco()+"', NUMERO='"+cli.getNumero()+"',TELEFONE='"+cli.getTelefone()+"' WHERE ID = "+cli.getId()+" ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		
	}
	public ResultSet listar() throws SQLException {
		con = Fabrica.get();
		Statement stm = con.createStatement();
		try {
			ResultSet rs = stm.executeQuery("Select * From CLIENTE;");
			return rs;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public void deletar(Clientes cli) throws SQLException {
		con = Fabrica.get();
		Statement stm = con.createStatement();
		try {
			stm.executeUpdate("DELETE FROM cliente WHERE ID ="+cli.getId()+"");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
}
