package dao;

import java.util.List;

import entidade.Cliente;

public class DAOCliente {

	public boolean salvar(Cliente cliente) {
		System.out.println("Inserido com sucesso "+cliente.getNome());
		//retorna booleano
		return true;
	}
	public boolean alterar(Cliente cliente) {
		System.out.println("Alterado com sucesso "+cliente.getNome());
		return true;
	}
	public boolean excluir(Cliente cliente) {
		System.out.println("Excluido com sucesso "+cliente.getNome());
		return true;
	}
	public boolean consultar(Cliente cliente) {
		//retorna lista
		//.println("Nome: "+cliente.getNome()+"cpf:"+cliente.getCpf()+"cidade:");
//		return cliente.getResultList();
		System.out.println("Consultado com sucesso "+cliente.getNome());
		return true;
	}
	
}
