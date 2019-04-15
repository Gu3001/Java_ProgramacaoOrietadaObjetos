package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.Conexao;
import entidade.Estado;

public class DAOEstado {
	public boolean salvat(Estado estado) {
		try {
			Connection conn = Conexao.get();
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO Estado(NOME, SIGLA) VALUES('"+
			estado.getNome()+"','"+estado.getSigla()+"')");//duvida nesse final
			
			return true;
		}catch(SQLException e){
			return false;
			
		}
		
	}
}


