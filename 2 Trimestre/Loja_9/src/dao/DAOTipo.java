package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Tipo;
import fabrica.Fabrica;



public class DAOTipo {
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	public Tipo inserir(Tipo tipo) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			transacao.begin();				
			gerenciador.persist(tipo);
			transacao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return tipo;
	}
	public Tipo excluir(Tipo tipo) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			tipo = gerenciador.find(Tipo.class, tipo.getId());
			gerenciador.remove(tipo);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return tipo;
	}
	public Tipo alterar(Tipo tipo) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.merge(tipo);
			transacao.commit();
			
		}catch(Exception e){
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}return tipo;
	}
	
	public List<Tipo> buscar() {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			
			return gerenciador.createQuery("from Tipo").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}
		
		return null;
	}
}