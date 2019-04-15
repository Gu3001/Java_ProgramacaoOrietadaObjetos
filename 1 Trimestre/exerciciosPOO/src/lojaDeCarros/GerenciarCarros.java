package lojaDeCarros;
import java.util.Scanner;

public class GerenciarCarros {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		String marca = scan.next();
		String marca[] = {"Chevrolet","Chevrolet","Chevrolet","Ford"};
		String modelo[] = {"Corsa","Onix","Onix Sport","escort"};
		int preco[] = { 12000, 30000, 40000 ,7000 };
		
		//Quantidade de carros de cada categoria
		for(int x = 0; x<marca.length; x++) {
		
		}
		//quantos carros tem por categoria
		Scanner scan = new Scanner(System.in);
		System.out.println("insira qual o preço mínimo do veículo");
		int precoMinimo = scan.nextInt();
		
		System.out.println("insira qual o preço máximo do veículo");
		int precoMaximo = scan.nextInt();
		
		for(int x = 0; x<marca.length;x++) {
			if(preco[x] >= precoMinimo && preco[x] <= precoMaximo) {
				System.out.println(marca[x]+" "+modelo[x]+" R$"+preco[x]);
			
			}
		}
	}
}
