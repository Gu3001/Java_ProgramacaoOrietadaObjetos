package principal;

import dao.DAOCliente;
import entidade.Cidade;
import entidade.Cliente;
import entidade.Estado;

public class Principal {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Cidade cidade = new Cidade();
		Estado estado = new Estado();
		
		DAOCliente dao = new DAOCliente();
		
		
		cliente.setId(0);
		cliente.setNome("Lucas");
		cliente.setCpf("12312312312");
		
		
		cidade.setId(0); 
		cliente.setIdCidade(cidade);
		
		cidade.setNome("Paranavaí");
		cliente.setNomeCidade(cidade);
		
		estado.setNome("Paraná");
		cliente.setNomeEstado(estado);
		
		estado.setSigla("PR");
		cliente.setSiglaEstado(estado);
		
		dao.salvar(cliente);
		dao.alterar(cliente);
		dao.excluir(cliente);
		dao.consultar(cliente);
		
		
	}
	
	
}
