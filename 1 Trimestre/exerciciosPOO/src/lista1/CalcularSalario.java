//Faça um programa que leia o número de horas trabalhadas (por dia) de um funcionário 
//por um período de 30 dias e apresente o salário bruto recebido por ele nesse período,
//sabendo que o valor do salário é R$ 8,00/hora trabalhada e que este mês teve 4
//domingos e dois sábados que ele não trabalhou.

package lista1;

import java.util.Scanner;

public class CalcularSalario {
	public static void main(String[] args) {
		System.out.println("Insira o nº de horas trabalhadas no dia");
		Scanner scan = new Scanner(System.in);
		int numHora = scan.nextInt();
		
		double valorDia = 8 * numHora;
		System.out.println("Em um dia você terá "+valorDia);
		System.out.println("Em uma semana você terá "+valorDia*7);
		System.out.println("Em um Mês voc ê terá "+valorDia*30);

	}
}
