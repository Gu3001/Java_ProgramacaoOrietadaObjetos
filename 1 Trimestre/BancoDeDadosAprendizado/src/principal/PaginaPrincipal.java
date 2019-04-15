package principal;

import java.util.Scanner;

public class PaginaPrincipal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EstadoPrincipal estado = new EstadoPrincipal();
		ClientePrincipal cliente = new ClientePrincipal();
		
		System.out.println(""
				+ "Insira a opção\n"
				+ "1 - menu Estado\n"
				+ "2 - menu Cliente\n"
				+ "3 - sair"
				+ "");
		int option = 0;
		System.out.println("Insira uma das opção: ");
		option = scan.nextInt();
		do{
			if(option == 1) {
				estado.menuEstado();
			}else if(option == 2) {
				cliente.menuCliente();
			}
			
		}while(option != 3);
		
	}
}
