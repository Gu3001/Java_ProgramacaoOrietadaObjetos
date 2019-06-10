// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOProdutos;
import dao.DAOCliente;
import entidade.Produtos;
import entidade.Cliente;
import principal.Principal;

public class TelaProdutos {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";

	private DAOProdutos daoprodutos = new DAOProdutos();
	private Principal principal = new Principal();
	
	public TelaProdutos() {
		Produtos produtos = new Produtos();
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
				System.out.println("Nome do Produto: ");
				String nome = scan.nextLine();
				produtos.setNome(nome);
				System.out.println("Descrição: ");
				String des = scan.nextLine();
				produtos.setDescricao(des);
				System.out.println("Quantidade Estoque: ");
				long est = scan.nextLong();
				produtos.setEstoque(est);
				System.out.println("Status Estoque: ");
				String status = scan.next();
				produtos.setStatus(status);
				
				daoprodutos.inserir(produtos);
				principal.main(null);
				
			}if (op ==2) {
				listarCadastrosProdutos();
				System.out.println("EXCLUIR CADASTRO");
				System.out.println("Insira o id do Cliente a ser excluido: ");
				produtos.setId( scan.nextLong() );
				daoprodutos.excluir(produtos);
				principal.main(null);
			}
			if (op ==3) {
				listarCadastrosProdutos();
				System.out.println("ALTERAR CADASTRO");
				System.out.println("Insira o Id do cadastro a ser alterado");	
				produtos.setId(scan.nextLong());
				System.out.println("Nome do Produto: ");
				String nome = scan.nextLine();
				produtos.setNome(nome);
				System.out.println("Descrição: ");
				String des = scan.nextLine();
				produtos.setDescricao(des);
				System.out.println("Quantidade Estoque: ");
				long est = scan.nextLong();
				produtos.setEstoque(est);
				System.out.println("Status Estoque: ");
				String status = scan.next();
				produtos.setStatus(status);
				
				System.out.println("Alterando...");
			
				daoprodutos.alterar(produtos);
				
				
				principal.main(null);
			}
			
			if(op == 4) {
				listarCadastrosProdutos();
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	public void listarCadastrosProdutos() {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS Produtos");
		List<Produtos> prod = daoprodutos.buscar();
		
		for(Produtos produtos : prod) {
			System.out.println("Id: "+produtos.getId()+" nome Produto: "+produtos.getNome()+"Estoque: "+produtos.getEstoque());
		}
	}

}