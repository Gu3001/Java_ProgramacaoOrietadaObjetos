// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOCompra;
import dao.DAOItensCompra;
import dao.DAOProdutos;
import dao.DAOVenda;
import entidade.Compra;
import entidade.ItensCompra;
import entidade.Produtos;
import entidade.Venda;
import principal.Principal;

public class TelaItensCompra {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";

	private DAOItensCompra daoitensCompra = new DAOItensCompra();
	private Principal principal = new Principal();
	
	public TelaItensCompra() {
		ItensCompra itensCompra = new ItensCompra();
		DAOVenda daovenda = new DAOVenda();
		Compra compra = new Compra();
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
				itensCompra.setQtde(qtde);
				System.out.println("valor: ");
				double valor = scan.nextDouble();
				itensCompra.setValor(valor);
				
				listarCadastrosCompra();
				System.out.println("Insira o ID da compra: ");
				long id = scan.nextLong();
				compra.setId(id);
				itensCompra.setCompra(compra);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				itensCompra.setProdutos(produtos);
			
				daoitensCompra.inserir(itensCompra);
				principal.main(null);
				
			}if (op ==2) {
				listarCadastrosItensCompra();
				System.out.println("EXCLUIR CADASTRO");
				System.out.println("Insira o id do Venda a ser excluido: ");
				itensCompra.setId( scan.nextLong() );
				daoitensCompra.excluir(itensCompra);
				principal.main(null);
			}
			if (op ==3) {
				listarCadastrosItensCompra();
				System.out.println("ALTERAR CADASTRO");
				System.out.println("Insira o Id do cadastro a ser alterado");	
				itensCompra.setId(scan.nextLong());
				
				System.out.println("Quantidade: ");
				long qtde = scan.nextLong();
				itensCompra.setQtde(qtde);
				System.out.println("valor: ");
				double valor = scan.nextDouble();
				itensCompra.setValor(valor);
				
				listarCadastrosCompra();
				System.out.println("Insira o ID da compra: ");
				long id = scan.nextLong();
				compra.setId(id);
				itensCompra.setCompra(compra);
				
				listarCadastrosProdutos();
				System.out.println("Insira o ID do produto: ");
				long id2 = scan.nextLong();
				produtos.setId(id2);
				itensCompra.setProdutos(produtos);
				
				System.out.println("Alterando...");
		
				daoitensCompra.alterar(itensCompra);
				principal.main(null);
			}
			
			if(op == 4) {
				listarCadastrosItensCompra();
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	public void listarCadastrosItensCompra() {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS ITENS COMPRA");
		List<ItensCompra> com = daoitensCompra.buscar(); //estudar melhor o percorrer da lista
		
		for(ItensCompra itensCompra : com) {
			System.out.println("Id: "+itensCompra.getId()+" idMovCompra: "+itensCompra.getCompra().getId()+" Produto: "+itensCompra.getProdutos().getId()+" qtde: "+itensCompra.getQtde()+" valor: "+itensCompra.getValor());
		}
	}
	public void listarCadastrosCompra() {
		DAOCompra daocompra = new DAOCompra();
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODOS COMPRAS");
		List<Compra> comp = daocompra.buscar(); //estudar melhor o percorrer da lista
		
		for(Compra compra : comp) {
			System.out.println("Id: "+compra.getId()+" Nome: "+compra.getData());
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