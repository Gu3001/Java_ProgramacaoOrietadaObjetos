package dao;
import java.util.Scanner;

import entidade.Pessoa;

public class DaoPessoa {
	public void pedirDados() {
		Scanner entrada = new Scanner(System.in);
		Pessoa cliente = new Pessoa();
		System.out.println("Insira seu Nome: ");
		cliente.setNome( entrada.nextLine() );
		System.out.println("Insira seu sobrenome: ");
		cliente.setSobrenome( entrada.nextLine() );
		System.out.println("Insira seu ano de nasc: ");
		cliente.setAnoNasc( entrada.nextInt() );
		
		System.out.println("Seu nome: "+ cliente.getNome());
		System.out.println("Seu sobrenome: "+ cliente.getSobrenome());
		System.out.println("Seu Ano de Nasc: "+ cliente.getAnoNasc());
		
		
		
	}
	public void imprimir() {
		Pessoa cliente = new Pessoa();

	}
	
	
	
}
