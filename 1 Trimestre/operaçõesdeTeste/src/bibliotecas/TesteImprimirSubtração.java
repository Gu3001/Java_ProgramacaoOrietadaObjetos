package bibliotecas;

import java.util.Scanner;

public class TesteImprimirSubtração {
	public static void main(String[] args) {
		Subtrair subtrair = new Subtrair();
		
		Scanner Scann = new Scanner(System.in);
		System.out.println("Num1");
		subtrair.numUm = Scann.nextInt();
		
		System.out.println("num2");
		subtrair.numDois = Scann.nextInt();
		
		int tot = subtrair.subtrairNumero();
		System.out.println(tot);
	}
}
