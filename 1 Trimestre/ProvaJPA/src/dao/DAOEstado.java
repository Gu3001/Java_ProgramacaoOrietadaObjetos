package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

import entidade.Estado;
import fabrica.Fabrica;

public class DAOEstado {
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	
	public Estado Inserir(Estado estado) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			
			transacao = gerenciador.getTransaction();
			
			
			
			transacao.begin();
			estado = gerenciador.find(Estado.class, estado.getId());
			gerenciador.remove(estado);
			gerenciador.merge(estado);
			gerenciador.persist(estado);
			transacao.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}
		
		return estado;
	}
	public List<Estado> buscar(){
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			
			return gerenciador.createQuery("from Estado").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			gerenciador.close();
		}return null;
	}
	
}
