package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.ItensVenda;
import fabrica.Fabrica;



public class DAOItensVenda {
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	public ItensVenda inserir(ItensVenda itensVenda) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			transacao.begin();				
			gerenciador.persist(itensVenda);
			transacao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return itensVenda;
	}
	public ItensVenda excluir(ItensVenda itensVenda) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			itensVenda = gerenciador.find(ItensVenda.class, itensVenda.getId());
			gerenciador.remove(itensVenda);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return itensVenda;
	}
	public ItensVenda alterar(ItensVenda itensVenda) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.merge(itensVenda);
			transacao.commit();
			
		}catch(Exception e){
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}return itensVenda;
	}
	
	public List<ItensVenda> buscar() {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			
			return gerenciador.createQuery("from ItensVenda").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}
		
		return null;
	}
}