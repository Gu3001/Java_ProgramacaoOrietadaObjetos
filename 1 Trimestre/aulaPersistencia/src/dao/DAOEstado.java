package dao;

import java.sql.Connection;
import java.sql.Statement;

import banco.Conexao;
import entidade.Estado;

public class DAOEstado {
	
	public boolean salvar(Estado estado) {
		try {
			String sql = String.format("INSERT INTO ESTADO (NOME,SIGLA) VALUES ('%s','%s')",estado.getNome(),estado.getSigla());
			Connection conn = Conexao.get();
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
