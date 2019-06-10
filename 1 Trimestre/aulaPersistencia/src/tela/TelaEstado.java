package tela;

import java.util.Scanner;

import dao.DAOEstado;
import entidade.Estado;

public class TelaEstado {
	
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - salvar \n 2 - excluir \n 3 - alterar \n 4 - consultar \n";
	private Estado estado = new Estado();
	private DAOEstado dao = new DAOEstado();
	
	public TelaEstado() {
		
		String r = "s";
		int op = 0;
		do {
			do {
				System.out.println(menu);
				op = scan.nextInt();
				scan.nextLine();
			}while(op < 1 && op > 4);
			
			if(op == 1) {
				System.out.println("nome:");
				String nome = scan.nextLine();
				
				System.out.println("sigla:");
				String sigla = scan.nextLine();
				
				estado.setNome(nome);
				estado.setSigla(sigla);
				
				dao.salvar(estado);
			}
			
			System.out.println("Continuar? (s/n)");
			r = scan.nextLine();
		}while(r.contentEquals("s"));
	}

}
