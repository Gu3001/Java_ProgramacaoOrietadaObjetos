package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Cliente;
import fabrica.Fabrica;



public class DAOCliente {
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	public Cliente inserir(Cliente cliente) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			transacao.begin();				
			gerenciador.persist(cliente);
			transacao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return cliente;
	}
	public Cliente excluir(Cliente cliente) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			cliente = gerenciador.find(Cliente.class, cliente.getId());
			gerenciador.remove(cliente);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally{
			gerenciador.close();
		}
		return cliente;
	}
	public Cliente alterar(Cliente cliente) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.merge(cliente);
			transacao.commit();
			
		}catch(Exception e){
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}return cliente;
	}
	
	public List<Cliente> buscar() {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			
			return gerenciador.createQuery("from Cliente").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}
		
		return null;
	}
}