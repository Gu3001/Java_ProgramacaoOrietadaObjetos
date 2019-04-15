package principal;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String args[]) {
		int menu = 0;
		
		menu = Integer.parseInt(JOptionPane.showInputDialog("--Menu Cliente--"+"\n"+ 
				"Cadastro Sistema"+"\n"+ 
				"1- Cliente "+"\n"+ 
				"2- Hospedagem"+"\n"+ 
				"3- Sair"));
		if(menu == 1) {
			CadastroCliente cadCli = new CadastroCliente();
			cadCli.cadastroCli();
		}
	}
}
