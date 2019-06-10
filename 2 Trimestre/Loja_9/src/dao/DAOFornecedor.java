package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Fornecedor;
import fabrica.Fabrica;



public class DAOFornecedor {
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	public Fornecedor inserir(Fornecedor fornecedor) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			transacao.begin();				
			gerenciador.persist(fornecedor);
			transacao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return fornecedor;
	}
	public Fornecedor excluir(Fornecedor fornecedor) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			fornecedor = gerenciador.find(Fornecedor.class, fornecedor.getId());
			gerenciador.remove(fornecedor);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return fornecedor;
	}
	public Fornecedor alterar(Fornecedor fornecedor) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.merge(fornecedor);
			transacao.commit();
			
		}catch(Exception e){
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}return fornecedor;
	}
	
	public List<Fornecedor> buscar() {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			
			return gerenciador.createQuery("from Fornecedor").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}
		
		return null;
	}
}