package lista1;
import java.util.Scanner;

public class CalculadoraTeste {
	public static void main(String[] args) {
		
		CalcularAgoraTeste calc = new CalcularAgoraTeste();
		
		System.out.println("Dígite o primeiro número: ");
		Scanner entrada = new Scanner(System.in);
		calc.num1 = entrada.nextInt();
		
		System.out.println("Dígite o segundo número: ");
		calc.num2 = entrada.nextInt();
		
		int total = calc.somar();
		
		System.out.println(total);
	}
}
