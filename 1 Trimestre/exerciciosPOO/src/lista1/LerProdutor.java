//6) Construa um programa que leia a quantidade e o preço de vários produtos diferentes
//(quantidade de leitura previamente definida pelo usuário) comprados por uma empresa
//e apresente o total desta compra. A quantidade e o preço fornecido pelo
//usuário não pode ser negativo.
package lista1;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LerProdutor {
	public static void main(String[] args) {
		String[] produtos = {"refrigerante","água","bolacha","sorvete"};
		double[] precos = {3.00,1.50,2.00,1.20};
		String resposta = "s";
		int p = 0;
		double total = 0;
		double totalFinal = 0;
		
		while (p != -1) {
			resposta = JOptionPane.showInputDialog("Quer escolher um produto(S) ou (N)?");
			if (resposta.equals("N") || resposta.equals("n")){
				break;
			}
			String produtoEspecifico = JOptionPane.showInputDialog("Insira o nome do produto");
			String quantidadeString = JOptionPane.showInputDialog("Insira a quantidade do produto");
			int quantidade = Integer.parseInt(quantidadeString);
			
			ArrayList prodEspecificos = new ArrayList();
			prodEspecificos.add(produtoEspecifico);
			
			ArrayList qtde = new ArrayList();
			qtde.add(quantidade);
			
			p++;
		}
		
		for(int t=0; t< 10;t++) {
			
			for(int x=0; x<10;x++) {
		
				if(prodEspecificos[x].equals(produtos[t])) {
					total = precos[t] * qtde[x];
					System.out.println(qtde[x]+"_"+produtos[t]+"= "+total);
					
					totalFinal = totalFinal + total;
				}
						
			}
		}
		System.out.println("O valor total é "+totalFinal);
	}
}