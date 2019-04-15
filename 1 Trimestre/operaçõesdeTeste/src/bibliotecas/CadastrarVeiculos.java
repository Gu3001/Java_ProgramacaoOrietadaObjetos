package bibliotecas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastrarVeiculos {
	public static void main(String[] args) {
		ArrayList<String> nomeVeiculo = new ArrayList();
		
		int contador = 0;
		while(contador != -1) {
			String resposta = JOptionPane.showInputDialog("Quer inserir um veículo (S) sim ou (N) não: ");
			if (resposta.equals("N")){
				break;
			}
			
			
			
		}
	}
}
