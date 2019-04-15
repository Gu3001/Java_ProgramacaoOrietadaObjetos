//4) Uma empresa precisa realizar entrevistas dom várias pessoas. Os dados 
//necessários são: nome, ano de nascimento, sexo,escolaridade e estado civil.
//Com o ano de nascimento é necessário que o programa calcule a idade da pessoa.
//Faça um programa que colete os dados das pessoas e informe quantos entrevistados
//com menos de 20 anos são casados.

//ATENÇÃO NÃO SEI COMO CRIAR UM VETOR VAZIO E IR ADICIONANDO
package lista1;

import javax.swing.JOptionPane;

public class AnalisarMenos20anosCasados {
	public static void main(String args[] ) {
		int contador = 0;
		String[] nome = new String[5];
		String[] anoNascString = new String[5];
		String[] sexo = new String[5];
		String[] escolaridade = new String[5];
		String[] estadoCivil = new String[5];
		
		while (contador < 2) {

			nome[contador]=JOptionPane.showInputDialog("Insira seu nome");
			anoNascString[contador] = JOptionPane.showInputDialog("Insira seu ano de nascimento");
			sexo[contador] = JOptionPane.showInputDialog("Insira seu sexo");
			escolaridade[contador] = JOptionPane.showInputDialog("Insira sua escolaridade");
			estadoCivil[contador] = JOptionPane.showInputDialog("Insira seu estado civil");
			contador++;
		}
		
		
		int cont = 0;
		int quantidade = 0;
		while (cont < 2) {
			Integer anoNasc = Integer.parseInt(anoNascString[cont]);
			int idade = 2019 - anoNasc;
			if (idade < 20 && (estadoCivil[cont].equals("casado") || estadoCivil[cont].equals("casada"))){
				quantidade++;
			}
			cont++;	
//			System.out.println(nome[cont]);
//			System.out.println(anoNascString[cont]);
//			System.out.println(sexo[cont]);
//			System.out.println(escolaridade[cont]);
//			System.out.println(estadoCivil[cont]);
//			System.out.println("------------");
		}
		System.out.println("existem "+quantidade+" pessoas casadas");	
	     
	}
}
