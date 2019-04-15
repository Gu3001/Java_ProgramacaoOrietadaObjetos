//9)  Solicite um número e apresente a tabuada deste número. No final o programa deverá apresentar
//três opções; anterior, novo e próximo. Na opção anterior o programa deverá apresentar a tabuada
//do número anterior, enquanto que na opção próximo o programa deverá apresentar a tabuada do 
//número posterior e no novo o programa deverá solicitar uma nova entrada.

package lista1;

import javax.swing.JOptionPane;

public class CalcularTabuada {
	public static void main(String args[]) {
		
		int verificacao = 0;
		String numString = JOptionPane.showInputDialog("Insira um nº para calcular a tabuada:");
		Integer num = Integer.parseInt(numString);
		while(verificacao != -1) {
			
			
			for(int x = 0; x<11; x++) {
				System.out.println(num+" x "+x+" = "+(num*x));
			}
			String resposta = JOptionPane.showInputDialog("N para novo, A para anterior, P para próximo, S para sair");
			if (resposta.equals("N")){
				numString = JOptionPane.showInputDialog("Insira um nº para calcular a tabuada:");
				num = Integer.parseInt(numString);
			} else if(resposta.equals("A")) {
				num = num -1;
			} else if (resposta.equals("P")) {
				num = num +1;
			} else if (resposta.equals("S")) {
				break;
			}
		}
		
		
	}
}

