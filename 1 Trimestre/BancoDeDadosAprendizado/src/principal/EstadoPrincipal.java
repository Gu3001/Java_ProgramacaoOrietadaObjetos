package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import conexao.Conexao;
import dao.DAO_Estado;
import entidade.Estado;

public class EstadoPrincipal {
	
	public void menuEstado() {
		Scanner scan = new Scanner(System.in);
		DAO_Estado dao = new DAO_Estado();
		Estado estado = new Estado();
		
		try {
			Conexao conexao = new Conexao();
			
			int option = 0;
			do {
				System.out.println("\n"
						+ "Insira sua opção\n"
						+ "1 - inserir\n"
						+ "2 - excluir\n"
						+ "3 - alterar\n"
						+ "4 - consultar\n"
						+ "5 - sair");
				
				option = scan.nextInt();
				scan.nextLine();
				if(option == 1) {
					System.out.println("Insira o nome do Estado: ");
					String nome = scan.nextLine();
					estado.setNome(nome);
					
					System.out.println("Insira a sigla do Estado");
					String sigla = scan.nextLine();
					estado.setSigla(sigla);
					dao.inserir(estado);
					
				}else if(option == 2) {
					ResultSet rs = dao.consultar();
					while(rs.next()) {
						System.out.println(rs.getString("id")+"-"+rs.getString("nome"));						
					}
					System.out.println("Informe o ID a ser excluído: ");
					String codigo = scan.nextLine();
					estado.setId(codigo);
					
					dao.excluir(estado);
							
					
				}else if(option == 3) {
					ResultSet rs = dao.consultar();
					while(rs.next()) {
						System.out.println(rs.getString("ID")+"-"+rs.getString("NOME")+"-"+rs.getString("SIGLA"));
					}
					System.out.println("Informe o ID do Estado a ser alterado: ");
					String codigo = scan.nextLine();
					estado.setId(codigo);
					System.out.println("Novo nome: ");
					String nome = scan.nextLine();
					estado.setNome(nome);
					System.out.println("nova sigla: ");
					String sigla = scan.nextLine();
					estado.setSigla(sigla);
					dao.alterar(estado);
//					
				}else if(option == 4) {
					ResultSet rs = dao.consultar();
					while(rs.next()) {
						System.out.println(rs.getString("ID")+"-"+rs.getString("NOME")+"-"+rs.getString("SIGLA"));
					}
//					
//					
				}
//				
			}while(option!=5);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
