package principal;

import dao.DAOCliente;
import entidade.Cliente;

public class Principal {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		DAOCliente dao = new DAOCliente();
		
		
		cliente.setId(0);
		cliente.setNome("Lucas");
		cliente.setCpf("12312312312");
		cliente.setIdCidade(0); //seria chave estrangeira
		cliente.setNomeCidade("Paranavaí");
		cliente.setNomeEstado("Paraná");
		cliente.setSiglaEstado("PR");
		
		dao.salvar(cliente);
		dao.alterar(cliente);
		dao.excluir(cliente);
		dao.consultar(cliente);
		
		
	}
	
	
}
