// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOLote;
import dao.DAOProdutos;
import dao.DAOVenda;
import entidade.Lote;
import entidade.Produtos;
import entidade.Venda;
import principal.Principal;

public class TelaLote {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";

	private DAOLote daolote = new DAOLote();
	private Principal principal = new Principal();
	
	public TelaLote() {
		Lote lote = new Lote();
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
				System.out.println("Data de Validade: ");
				String dt = scan.next();
				lote.setDataValid(dt);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				lote.setProdutos(produtos);
			
				daolote.inserir(lote);
				principal.main(null);
				
			}if (op ==2) {
				listarCadastrosLote();
				System.out.println("EXCLUIR CADASTRO");
				System.out.println("Insira o id do Venda a ser excluido: ");
				lote.setId( scan.nextLong() );
				daolote.excluir(lote);
				principal.main(null);
			}
			if (op ==3) {
				listarCadastrosLote();
				System.out.println("ALTERAR CADASTRO");
				System.out.println("Insira o Id do cadastro a ser alterado");	
				lote.setId(scan.nextLong());
				
				System.out.println("Data de Validade: ");
				String dt = scan.next();
				lote.setDataValid(dt);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				lote.setProdutos(produtos);
				
				System.out.println("Alterando...");
		
				daolote.alterar(lote);
				principal.main(null);
			}
			
			if(op == 4) {
				listarCadastrosLote();
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	public void listarCadastrosLote() {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS LOTE");
		List<Lote> com = daolote.buscar(); //estudar melhor o percorrer da lista
		
		for(Lote lote : com) {
			System.out.println("Id: "+lote.getId()+" data valid: "+lote.getDataValid());
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