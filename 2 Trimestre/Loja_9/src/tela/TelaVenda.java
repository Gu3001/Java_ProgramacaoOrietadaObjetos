// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOVenda;
import dao.DAOCliente;
import entidade.Venda;
import entidade.Cliente;
import principal.Principal;

public class TelaVenda {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";

	private DAOVenda daovenda = new DAOVenda();
	private Principal principal = new Principal();
	
	public TelaVenda() {
		Venda venda = new Venda();
		DAOCliente daocliente = new DAOCliente();
		Cliente cliente = new Cliente();

		
		String r = "s";
		int op = 0;
		do {
			do {
				System.out.println(menu);
				op = scan.nextInt();
				scan.nextLine();
			}while(op < 1 && op > 4);
			
			if(op == 1) {
				System.out.println("Data da Venda: ");
				String data = scan.nextLine();
				venda.setData(data);
				listarCadastrosCliente();
				
				System.out.println("Insira o ID do cliente: ");
				long id = scan.nextLong();
				cliente.setId(id);
				venda.setCliente(cliente);
				daovenda.inserir(venda);
				principal.main(null);
				
			}if (op ==2) {
				listarCadastrosVenda();
				System.out.println("EXCLUIR CADASTRO");
				System.out.println("Insira o id do Cliente a ser excluido: ");
				venda.setId( scan.nextLong() );
				daovenda.excluir(venda);
				principal.main(null);
			}
			if (op ==3) {
				listarCadastrosVenda();
				System.out.println("ALTERAR CADASTRO");
				System.out.println("Insira o Id do cadastro a ser alterado");	
				venda.setId(scan.nextLong());
				System.out.println("Nova Data: ");
				venda.setData(scan.next());
				
				listarCadastrosCliente();
				System.out.println("Novo Cliente, id: ");
				long id = scan.nextLong();
				
				System.out.println("Alterando...");
				
				cliente.setId(id);
				venda.setCliente(cliente);
				daovenda.alterar(venda);
				
				
				principal.main(null);
			}
			
			if(op == 4) {
				listarCadastrosVenda();
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	public void listarCadastrosVenda() {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODAS COMPRAS");
		List<Venda> com = daovenda.buscar(); //estudar melhor o percorrer da lista
		
		for(Venda venda : com) {
			System.out.println("Id: "+venda.getId()+" Data Venda: "+venda.getData()+" Cliente: "+venda.getCliente());
		}
	}
	public void listarCadastrosCliente() {
		DAOCliente daocliente = new DAOCliente();
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS CLIENTEs");
		List<Cliente> clie = daocliente.buscar(); //estudar melhor o percorrer da lista
		
		for(Cliente cliente : clie) {
			System.out.println("Id: "+cliente.getId()+" Nome: "+cliente.getNome());
		}
	}


}