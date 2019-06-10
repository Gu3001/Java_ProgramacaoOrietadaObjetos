// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOTipo;
import dao.DAOProdutos;
import dao.DAOVenda;
import entidade.Tipo;
import entidade.Produtos;
import entidade.Venda;
import principal.Principal;

public class TelaTipo {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";

	private DAOTipo daotipo = new DAOTipo();
	private Principal principal = new Principal();
	
	public TelaTipo() {
		Tipo tipo = new Tipo();
		DAOVenda daovenda = new DAOVenda();
		Venda venda = new Venda();
		Produtos produtos = new Produtos();

		
		String r = "s";
		int op = 0;
		do {
			do {
				System.out.println(menu);
				op = scan.nextInt();
				scan.nextLine();
			}while(op < 1 && op > 4);
			
			if(op == 1) {
				System.out.println("Tipo: ");
				String tip = scan.next();
				tipo.setTipo(tip);
				System.out.println("SubTipo: ");
				String subtipo = scan.next();
				tipo.setSubtipo(subtipo);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				tipo.setProdutos(produtos);
			
				daotipo.inserir(tipo);
				principal.main(null);
				
			}if (op ==2) {
				listarCadastrosTipo();
				System.out.println("EXCLUIR CADASTRO");
				System.out.println("Insira o id do Venda a ser excluido: ");
				tipo.setId( scan.nextLong() );
				daotipo.excluir(tipo);
				principal.main(null);
			}
			if (op ==3) {
				listarCadastrosTipo();
				System.out.println("ALTERAR CADASTRO");
				System.out.println("Insira o Id do cadastro a ser alterado");	
				tipo.setId(scan.nextLong());
				
				System.out.println("Tipo: ");
				String tip = scan.next();
				tipo.setTipo(tip);
				System.out.println("SubTipo: ");
				String subtipo = scan.next();
				tipo.setTipo(subtipo);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				tipo.setProdutos(produtos);
				
				System.out.println("Alterando...");
		
				daotipo.alterar(tipo);
				principal.main(null);
			}
			
			if(op == 4) {
				listarCadastrosTipo();
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	public void listarCadastrosTipo() {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS TIPO");
		List<Tipo> com = daotipo.buscar(); //estudar melhor o percorrer da lista
		
		for(Tipo tipo : com) {
			System.out.println("Id: "+tipo.getId()+" tipo: "+tipo.getTipo());
		}
	}

	public void listarCadastrosProdutos() {
		
		DAOProdutos daoprodutos= new DAOProdutos();
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS Produtos");
		List<Produtos> prod = daoprodutos.buscar();
		
		for(Produtos produtos : prod) {
			System.out.println("Id: "+produtos.getId()+" nome Produto: "+produtos.getNome()+"Estoque: "+produtos.getEstoque());
		}
	}
	


}