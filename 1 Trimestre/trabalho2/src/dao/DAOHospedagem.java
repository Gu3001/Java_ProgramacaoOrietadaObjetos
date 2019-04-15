package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import fabrica.Fabrica;
import entidade.Hospedagem;

public class DAOHospedagem {
	public Connection con;
	
	public void salvar(Hospedagem hosp) throws SQLException{
		con = Fabrica.get();
		Statement stm = con.createStatement();
		try {
			stm.executeUpdate("INSERT INTO HOTEL (NOME_HOTEL, DIARIA, QUAN_QUARTOS, CIDADE) VALUES('"+hosp.getNome()+"', '"+hosp.getValorTotal()+"', '"+hosp.getQuantQuartos()+"', '"+hosp.getCidade()+"') ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally { 
			con.close();
		}
	}
	public void alterar(Hospedagem hosp) throws SQLException {
		con = Fabrica.get();
		Statement stm = con.createStatement();
		try {
			stm.executeLargeUpdate("UPDATE HOTEL SET NOME_HOTEL='"+hosp.getNome()+"',DIARIA='"+hosp.getValorTotal()+"',QUAN_QUARTOS='"+hosp.getQuantQuartos()+"', CIDADE='"+hosp.getCidade()+"' ");
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
			ResultSet rs = stm.executeQuery("Select * From HOTEL;");
			return rs;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public void deletar(Hospedagem hosp) throws SQLException {
		con = Fabrica.get();
		Statement stm = con.createStatement();
		try {
			stm.executeUpdate("DELETE FROM HOTEL WHERE ID ="+hosp.getId()+"");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	
	
}
