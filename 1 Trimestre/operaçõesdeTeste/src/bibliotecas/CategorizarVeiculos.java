//		uma loja de carro vende carros usados e novos. A empresa precisa de um sistema que 
//		cadastre os carros e fa�a uma categoriza��o de pre�os. no final o sistema dever� apresentar
//		a quantidades de carros de cada categoria.
package bibliotecas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CategorizarVeiculos {
	public static void main(String[] args) {
		ArrayList<String> nomeVeiculo = new ArrayList<>();
		
		int test = 0;
		while(test != -1) {
			String resposta = JOptionPane.showInputDialog("Deseja inserir um novo Ve�culo? (S) sim ou (N) n�o: ");
			if(resposta.equals("N") || resposta.equals("n")) {
				break;
			}
			String veiculo = JOptionPane.showInputDialog("Insira o nome do ve�culo: ");
			nomeVeiculo.add(veiculo);
			
		}
		
		for(int x= 0; x < 10; x++) {
//			System.out.prinln(nomeVeiculo);
		}
		
		

		

		
		
	}
}
