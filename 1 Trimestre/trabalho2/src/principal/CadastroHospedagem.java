package principal;


import java.sql.ResultSet;
import java.util.Scanner;
import dao.DAOHospedagem;
import entidade.Hospedagem;

public class CadastroHospedagem {

	public static void cadastrohosp() {
		DAOHospedagem dao = new DAOHospedagem();
		Hospedagem hosp = new Hospedagem();
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
					hosp.setId(id);
				}
				System.out.println("Informe seu Nome: ");
				String nome = teclado.nextLine();
				hosp.setNome(nome);
				
				System.out.println("Informe o valor da diária: ");
				String valorTotal = teclado.nextLine(); 
				double tot = Double.parseDouble(valorTotal);
				hosp.setValorTotal(tot);
				
				System.out.println("Informe a quantidade quartos disponiveis: ");
				String quart = teclado.nextLine();
				int quantQuartos = Integer.parseInt(quart);
				hosp.setQuantQuartos(quantQuartos);
				
				System.out.println("Informe sua Cidade: ");
				String cidade = teclado.nextLine();
				hosp.setCidade(cidade);
				
				
				if (menu == 1) {
					dao.salvar(hosp);
					System.out.println("Hotel Salvo com Sucesso");
				}else {
					dao.alterar(hosp);
					System.out.println("Hotel Alterado com Sucesso");
				}
			}else if (menu == 3){
				ResultSet rs = dao.listar();
				String resultado = "";
				while (rs.next()) {
					resultado = resultado + rs.getInt("ID")+"- "+rs.getString("NOME_HOTEL")+"\n";
				}
				System.out.print( resultado);
				
			}else if(menu == 4) {
				System.out.print("Informe id que deseja excluir: ");
				int id = teclado.nextInt();
				hosp.setId(id);
				dao.deletar(hosp);
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
