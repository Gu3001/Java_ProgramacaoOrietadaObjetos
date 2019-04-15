package controle;


import java.util.Scanner;


public class ControlarBD {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int opcao = -1;
	while(opcao != 0) {
		System.out
		.println("\n\n### MENU DE OPCOES ###");
		System.out.println("\n                =========================");
		System.out.println("                  |    1 - Inserir        |");
		System.out.println("                  |    2 - Selecionar Tudo|");
		System.out.println("                  |    3 - Deletar        |");
		System.out.println("                  |    4 - Alterar        |");
		System.out.println("                  |    5 - Consultar      |");
		System.out.println("                  |    0 - Sair           |");
		System.out.println("                  =========================\n");
		System.out.println("Insira a opcao: ");
		opcao = entrada.nextInt();
		System.out.print("\n");
		switch (opcao) {
			case 1:
				//inserir dados
				Inserir insert = new Inserir();
				insert.inserirDados();
			case 2:
				//selecionarTodos
				SelecionarTodos selectTudo = new SelecionarTodos();
				selectTudo.selecionarTodosDados();
			case 3:
				//excluir
				Deletar delete = new Deletar();
				delete.deletarCadastro();
			case 4:
				//alterar
				Alterar alter = new Alterar();
				alter.alterarCadastro();
			case 5:
				//consultar
				Consultar consult = new Consultar();
				consult.consultarCadastro();
			case 0:
				System.out.println("Saindo!");
				break;
			default:
				System.out.println("Opção Inválida!");
			}
		}
	}
}
