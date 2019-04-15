package analisarCarro;

import java.util.Scanner;

public class DAOCarro {
	public void inserirCarro() {
		Scanner entrada = new Scanner(System.in);
		Carro car = new Carro();//get ou set
		System.out.println("Insira o nome do Carro: ");
		car.setNome( entrada.nextLine() );
		System.out.println("Insira o modelo do Carro: ");
		car.setModelo( entrada.nextLine() );
		System.out.println("Insira o marca do Carro: ");
		car.setMarca( entrada.nextLine() );
		System.out.println("Insira o ano do Carro: ");
		car.setAno( entrada.nextInt() );
			
		System.out.println(car.getNome());
		System.out.println(car.getModelo());
		System.out.println(car.getMarca());
		System.out.println(car.getAno());
	}

}
