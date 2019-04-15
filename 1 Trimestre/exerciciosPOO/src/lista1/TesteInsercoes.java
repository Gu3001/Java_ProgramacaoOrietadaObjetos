package lista1;

import java.util.Scanner;

public class TesteInsercoes {
	public int num1;
	public int num2;
	
	public int inserirNum1() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o primeiro Valor: ");
		num1 = entrada.nextInt();
		return(num1);
	
	}
	public int inserirNum2() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o segundo Valor: ");
		num2 = entrada.nextInt();
		return(num2);
	}
	

}
