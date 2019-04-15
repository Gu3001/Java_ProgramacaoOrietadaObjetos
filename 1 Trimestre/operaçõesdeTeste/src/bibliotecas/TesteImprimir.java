package bibliotecas;

import java.util.Scanner;

public class TesteImprimir {
	public static void main(String[] args) {
		
		SomarAgora soma = new SomarAgora();//variavel, criando objeto, somar é uma classe
		
		Scanner Scann = new Scanner(System.in); //criando novo objeto
		System.out.println("num1");
		soma.num1 = Scann.nextInt(); //leitura no stributo soma
		
		System.out.println("num2");
		soma.num2 = Scann.nextInt();
		
		int total = soma.somarNumero();
		System.out.println(total);
		
	}
}
