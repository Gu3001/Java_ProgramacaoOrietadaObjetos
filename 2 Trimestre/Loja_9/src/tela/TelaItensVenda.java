// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOItensVenda;
import dao.DAOProdutos;
import dao.DAOVenda;
import entidade.ItensVenda;
import entidade.Produtos;
import entidade.Venda;
import principal.Principal;

public class TelaItensVenda {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";

	private DAOItensVenda daoitensVenda = new DAOItensVenda();
	private Principal principal = new Principal();
	
	public TelaItensVenda() {
		ItensVenda itensVenda = new ItensVenda();
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
				System.out.println("Quantidade: ");
				long qtde = scan.nextLong();
				itensVenda.setQtde(qtde);
				System.out.println("valor: ");
				double valor = scan.nextDouble();
				itensVenda.setValor(valor);
				
				listarCadastrosVenda();
				System.out.println("Insira o ID do venda: ");
				long id = scan.nextLong();
				venda.setId(id);
				itensVenda.setVenda(venda);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				itensVenda.setProdutos(produtos);
			
				daoitensVenda.inserir(itensVenda);
				principal.main(null);
				
			}if (op ==2) {
				listarCadastrosItensVenda();
				System.out.println("EXCLUIR CADASTRO");
				System.out.println("Insira o id do Venda a ser excluido: ");
				itensVenda.setId( scan.nextLong() );
				daoitensVenda.excluir(itensVenda);
				principal.main(null);
			}
			if (op ==3) {
				listarCadastrosItensVenda();
				System.out.println("ALTERAR CADASTRO");
				System.out.println("Insira o Id do cadastro a ser alterado");	
				itensVenda.setId(scan.nextLong());
				
				System.out.println("Quantidade: ");
				long qtde = scan.nextLong();
				itensVenda.setQtde(qtde);
				System.out.println("valor: ");
				double valor = scan.nextDouble();
				itensVenda.setValor(valor);
				
				listarCadastrosVenda();
				System.out.println("Insira o ID do venda: ");
				long id = scan.nextLong();
				venda.setId(id);
				itensVenda.setVenda(venda);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				itensVenda.setProdutos(produtos);
				
				System.out.println("Alterando...");
		
				daoitensVenda.alterar(itensVenda);
				principal.main(null);
			}
			
			if(op == 4) {
				listarCadastrosItensVenda();
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	public void listarCadastrosItensVenda() {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS ITENS VENDA");
		List<ItensVenda> com = daoitensVenda.buscar(); //estudar melhor o percorrer da lista
		
		for(ItensVenda itensVenda : com) {
			System.out.println("Id: "+itensVenda.getId()+" idMovCompra: "+itensVenda.getVenda().getId()+" Produto: "+itensVenda.getProdutos().getId()+" qtde: "+itensVenda.getQtde()+" valor: "+itensVenda.getValor());
		}
	}
	public void listarCadastrosVenda() {
		DAOVenda daovenda = new DAOVenda();
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS VENDAS");
		List<Venda> vend = daovenda.buscar(); //estudar melhor o percorrer da lista
		
		for(Venda venda : vend) {
			System.out.println("Id: "+venda.getId()+" Nome: "+venda.getData());
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