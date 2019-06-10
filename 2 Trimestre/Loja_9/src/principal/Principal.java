
package principal;

import java.util.Scanner;

import entidade.Cliente;
import entidade.Fornecedor;
import entidade.Produtos;
import tela.TelaCliente;
import tela.TelaCompra;
import tela.TelaFornecedor;
import tela.TelaItensCompra;
import tela.TelaItensVenda;
import tela.TelaLote;
import tela.TelaPreco;
import tela.TelaProdutos;
import tela.TelaTipo;
import tela.TelaVenda;

public class Principal {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Gerenciar Cliente");
		System.out.println("2 - Gerenciar Fornecedor");
		System.out.println("3 - Gerenciar Compras");
		System.out.println("4 - Gerenciar Vendas");
		System.out.println("5 - Gerenciar Itens de Compra");
		System.out.println("6 - Gerenciar Itens de Venda");
		System.out.println("7 - Gerenciar Produtos");
		System.out.println("8 - Gerenciar lotes");
		System.out.println("9 - Gerenciar tipos");
		System.out.println("10 - Gerenciar precos");
		
		int op = scan.nextInt();
		scan.nextLine();
		
		if(op == 1) {
			TelaCliente cliente = new TelaCliente();
		}
		if(op == 2) {
			TelaFornecedor fornecedor = new TelaFornecedor();
		}
		if (op == 3) {
			TelaCompra compra = new TelaCompra();
		}
		if (op == 4) {
			TelaVenda venda = new TelaVenda();
		}
		if (op == 5) {
			TelaItensCompra itensCompra = new TelaItensCompra();
		}
		if (op == 6) {
			TelaItensVenda itensVenda = new TelaItensVenda();
		}
		if (op == 7) {
			TelaProdutos produtos = new TelaProdutos();
		}
		if (op == 8) {
			TelaLote lote = new TelaLote();
		}
		if (op == 9) {
			TelaTipo tipo = new TelaTipo();
		}
		if (op == 10) {
			TelaPreco preco = new TelaPreco();
		}


	}
	
}

