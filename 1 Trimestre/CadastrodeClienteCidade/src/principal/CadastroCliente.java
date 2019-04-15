package principal;

import java.util.Scanner;
import entidade.Cliente;
import dao.DAOCliente;

public class CadastroCliente {
	public static void cadastroCli() {
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		Cliente cli = new Cliente();
		DAOCliente dao = new DAOCliente();
		
			int option = -1;
			try {
			while (option != 0) {
				
				
				
				
				if(option == 1) {
					try {
						System.out.println("Insira seu Nome");
						cli.setNome(nome);
						dao.inserir(cli);
					
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("Opção Inválida");
					}
				}
				else if(option == 2) {
					try {

						System.out.println("Informe id que deseja alterar");
						String id1 = entrada.nextLine();
						int id = Integer.parseInt(id1);
						cli.setId(id);
					
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("Opção Inválida");
					}
		}
	
	}
	
}
