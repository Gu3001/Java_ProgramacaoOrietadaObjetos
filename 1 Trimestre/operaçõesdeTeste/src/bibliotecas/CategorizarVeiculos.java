//		uma loja de carro vende carros usados e novos. A empresa precisa de um sistema que 
//		cadastre os carros e faça uma categorização de preços. no final o sistema deverá apresentar
//		a quantidades de carros de cada categoria.
package bibliotecas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CategorizarVeiculos {
	public static void main(String[] args) {
		ArrayList<String> nomeVeiculo = new ArrayList<>();
		
		int test = 0;
		while(test != -1) {
			String resposta = JOptionPane.showInputDialog("Deseja inserir um novo Veículo? (S) sim ou (N) não: ");
			if(resposta.equals("N") || resposta.equals("n")) {
				break;
			}
			String veiculo = JOptionPane.showInputDialog("Insira o nome do veículo: ");
			nomeVeiculo.add(veiculo);
			
		}
		
		for(int x= 0; x < 10; x++) {
//			System.out.prinln(nomeVeiculo);
		}
		
		

		

		
		
	}
}
