package principal;

import java.util.Scanner;

import tela.TelaEstado;

public class Principal {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("1-Estado");
		int op = scan.nextInt();
		scan.nextLine();
		
		if(op ==1) {
			TelaEstado t = new TelaEstado();
		}
		
		
	}

}
