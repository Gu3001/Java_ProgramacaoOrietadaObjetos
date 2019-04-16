package principal;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import conexao.Conexao;
import dao.DAOCliente;
import entidade.Cliente;


public class ClientePrincipal {
	public void menuCliente() {
		int option = 0;
		Scanner scan = new Scanner(System.in);
		Cliente cliente = new Cliente();
		DAOCliente dao = new DAOCliente();
		
		
		try {
			System.out.println("\n"
					+ "Insira sua opção\n"
					+ "1 - inserir\n"
					+ "2 - excluir\n"
					+ "3 - alterar\n"
					+ "4 - consultar\n"
					+ "5 - sair");
			//data transfer objeto
			
			option = scan.nextInt();
			scan.nextLine();
			
			if(option == 1) {
				System.out.println("Insira seu nome:");
				cliente.setNome(scan.nextLine());
				System.out.println("Insira seu RG:");
				cliente.setRg(scan.nextLine());
				System.out.println("Insira seu CPF:");
				cliente.setCpf(scan.nextLine());
				System.out.println("Insira seu Telefone:");
				cliente.setTelefone(scan.nextLine());
				dao.inserir(cliente);
			
			}else if(option == 2) {
//				ResultSet rs = dao.consultar();
//				while(rs.next()) {
//					System.out.println(rs.getString("id")+"-"+rs.getString("nome"));						
//				}
				System.out.println("Informe o ID a ser excluído: ");
				String codigo = scan.nextLine();
				cliente.setId(codigo);
				dao.excluir(cliente);
				
			}else if(option == 3) {
				System.out.println("Informe o ID do Estado a ser alterado: ");
				cliente.setId(scan.nextLine());
				System.out.println("Insira seu nome:");
				cliente.setNome(scan.nextLine());
				System.out.println("Insira seu RG:");
				cliente.setRg(scan.nextLine());
				System.out.println("Insira seu CPF:");
				cliente.setCpf(scan.nextLine());
				System.out.println("Insira seu Telefone:");
				cliente.setTelefone(scan.nextLine());
				dao.alterar(cliente);
				
			}else if(option == 4) {
				
				//falta percorrer a lista do consultar
				List<Cliente> dados = new ArrayList<Cliente>();
				dados = dao.consultar();
				
				System.out.println(dados[0]);

			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
