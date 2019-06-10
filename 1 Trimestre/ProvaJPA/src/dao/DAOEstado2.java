package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Estado;
import fabrica.Fabrica;

public class DAOEstado2 {
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	public List<Estado> buscar(){
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			
			return gerenciador.createQuery("from Estado").getResultList();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			gerenciador.close();
		}
		
		
		return null;
	}

	
}
