	// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOCliente;
import entidade.Cliente;
import principal.Principal;

public class TelaCliente {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";
	private DAOCliente daocliente = new DAOCliente();
	private Principal principal = new Principal();
	
	public TelaCliente() {
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
				System.out.println("Nome da cliente: ");
				String nome = scan.nextLine();
				cliente.setNome(nome);
				System.out.println(" rg: ");
				String rg = scan.nextLine();
				cliente.setRg(rg);
				System.out.println(" cpf: ");
				String cpf = scan.nextLine();
				cliente.setCpf(cpf);
				System.out.println("Endereco: ");
				String endereco = scan.nextLine();
				cliente.setEndereco(endereco);
				System.out.println("Telefone: ");
				String telefone = scan.nextLine();
				cliente.setTelefone(telefone);
			
				daocliente.inserir(cliente);
				principal.main(null);
				//colocar para retornar para principal no final de cada um
			}if (op ==2) {
				listarCadastrosCliente();
				System.out.println("EXCLUIR CADASTRO");
				System.out.println("Insira o id do Estado a ser excluido: ");
				cliente.setId( scan.nextLong() );
				daocliente.excluir(cliente);
				principal.main(null);
			}
			if (op ==3) {
				listarCadastrosCliente();
				System.out.println("ALTERAR CADASTRO");
				System.out.println("Insira o Id do cadastro a ser alterado");	
				cliente.setId(scan.nextLong());
				System.out.println("Nome da cliente: ");
				String nome = scan.nextLine();
				cliente.setNome(nome);
				System.out.println(" rg: ");
				String rg = scan.nextLine();
				cliente.setRg(rg);
				System.out.println(" cpf: ");
				String cpf = scan.nextLine();
				cliente.setCpf(cpf);
				System.out.println("Endereco: ");
				String endereco = scan.nextLine();
				cliente.setEndereco(endereco);
				System.out.println("Telefone: ");
				String telefone = scan.nextLine();
				cliente.setTelefone(telefone);
				
				System.out.println("Alterando...");
				
				
				daocliente.alterar(cliente);
				
				
				principal.main(null);
			}
			
			if(op == 4) {
				listarCadastrosCliente();
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	public void listarCadastrosCliente() {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS CLIENTES");
		List<Cliente> cid = daocliente.buscar(); 
		
		for(Cliente cliente : cid) {
			System.out.println("Id: "+cliente.getId()+" Cliente: "+cliente.getNome());
		}
	}
	public TelaCliente(String x) {
		
	}
	public TelaCliente(int c) {
		
	}
	public TelaCliente(double q) {
		
	}


}