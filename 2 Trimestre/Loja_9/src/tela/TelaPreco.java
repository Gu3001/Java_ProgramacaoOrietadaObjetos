// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOPreco;
import dao.DAOProdutos;
import dao.DAOVenda;
import entidade.Preco;
import entidade.Produtos;
import entidade.Venda;
import principal.Principal;

public class TelaPreco {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";

	private DAOPreco daopreco = new DAOPreco();
	private Principal principal = new Principal();
	
	public TelaPreco() {
		Preco preco = new Preco();
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
				System.out.println("Preco: ");
				String prec = scan.next();
				preco.setPreco(prec);
				System.out.println("Data de Inicio: ");
				String dt = scan.next();
				preco.setDtInicio(dt);
				System.out.println("Data Final: ");
				String dt2 = scan.next();
				preco.setDtFinal(dt2);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				preco.setProdutos(produtos);
			
				daopreco.inserir(preco);
				principal.main(null);
				
			}if (op ==2) {
				listarCadastrosPreco();
				System.out.println("EXCLUIR CADASTRO");
				System.out.println("Insira o id do Venda a ser excluido: ");
				preco.setId( scan.nextLong() );
				daopreco.excluir(preco);
				principal.main(null);
			}
			if (op ==3) {
				System.out.println("Preco: ");
				String prec = scan.next();
				preco.setPreco(prec);
				System.out.println("Data de Inicio: ");
				String dt = scan.next();
				preco.setDtInicio(dt);
				System.out.println("Data Final: ");
				String dt2 = scan.next();
				preco.setDtFinal(dt2);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				preco.setProdutos(produtos);
				
				System.out.println("Alterando...");
		
				daopreco.alterar(preco);
				principal.main(null);
			}
			
			if(op == 4) {
				listarCadastrosPreco();
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	public void listarCadastrosPreco() {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS PRECO");
		List<Preco> com = daopreco.buscar(); //estudar melhor o percorrer da lista
		
		for(Preco preco : com) {
			System.out.println("Id: "+preco.getId()+" preco: "+preco.getPreco());
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