package principal;


import java.sql.ResultSet;
import java.util.Scanner;
import dao.DAOGeneration;
import entidade.Clientes;

public class CadastroCliente {

	public static void cadastrocli() {
		DAOGeneration dao = new DAOGeneration();
		Clientes cli = new Clientes();
		Scanner teclado = new Scanner(System.in);
		boolean sistema = true;
		String menu1;
		try {
			while (sistema == true) {
				
				System.out.println("--Menu Cliente--"+"\n"+ 
						"1- Inserir "+"\n"+ 
						"2- Alterar "+"\n"+ 
						"3- Listar"+"\n"+ 
						"4- Deletar"+"\n"+
						"5- Sair");
				menu1 = teclado.nextLine();
				int menu = Integer.parseInt(menu1);
			if (menu == 1 || menu == 2) {
				if(menu == 2) {
					System.out.println("Informe id que deseja alterar");
					String id1 = teclado.nextLine();
					int id = Integer.parseInt(id1);
					cli.setId(id);
				}
				System.out.println("Informe seu Nome: ");
				String nome = teclado.nextLine();
				cli.setNome(nome);
				
				System.out.println("Informe seu RG: ");
				String rg = teclado.nextLine();
				cli.setRg(rg);
				
				System.out.println("Informe seu CPF: ");
				String cpf = teclado.nextLine();
				cli.setCpf(cpf);
				
				System.out.println("Informe seu Endereço: ");
				String endereco = teclado.nextLine();
				cli.setEndereco(endereco);
				
				System.out.println("Informe o numero de sua residencia: ");
				String n = teclado.nextLine();
				cli.setNumero(n);
				
				System.out.println("Informe seu telefone: ");
				String telefone = teclado.nextLine();
				cli.setTelefone(telefone);
				
				if (menu == 1) {
					dao.salvar(cli);
					System.out.println("Cliente Salvo com Sucesso");
				}else {
					dao.alterar(cli);
					System.out.println("Cliente Alterado com Sucesso");
				}
			}else if (menu == 3){
				ResultSet rs = dao.listar();
				String resultado = "";
				while (rs.next()) {
					resultado = resultado + rs.getInt("ID")+"- "+rs.getString("NOME")+"\n";
				}
				System.out.print( resultado);
				
			}else if(menu == 4) {
				System.out.print("Informe id que deseja excluir: ");
				int id = teclado.nextInt();
				cli.setId(id);
				dao.deletar(cli);
				System.out.println("Cliente Excluido com sucesso!");
			}else if (menu == 5) {
				sistema = false;
				System.out.print("Obrigado");
			}

		}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print("Opção Inválida");
		}
	}
}
