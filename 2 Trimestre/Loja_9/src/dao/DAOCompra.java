package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Compra;
import fabrica.Fabrica;



public class DAOCompra {
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	public Compra inserir(Compra compra) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			transacao.begin();				
			gerenciador.persist(compra);
			transacao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return compra;
	}
	public Compra excluir(Compra compra) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			compra = gerenciador.find(Compra.class, compra.getId());
			gerenciador.remove(compra);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return compra;
	}
	public Compra alterar(Compra compra) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.merge(compra);
			transacao.commit();
			
		}catch(Exception e){
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}return compra;
	}
	
	public List<Compra> buscar() {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			
			return gerenciador.createQuery("from Compra").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}
		
		return null;
	}
}