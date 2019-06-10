	// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOFornecedor;
import entidade.Fornecedor;
import principal.Principal;

public class TelaFornecedor {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";
	private DAOFornecedor daofornecedor = new DAOFornecedor();
	private Principal principal = new Principal();
	
	public TelaFornecedor() {
		Fornecedor fornecedor = new Fornecedor();

		String r = "s";
		int op = 0;
		do {
			do {
				System.out.println(menu);
				op = scan.nextInt();
				scan.nextLine();
			}while(op < 1 && op > 4);
			
			if(op == 1) {
				System.out.println("Nome da fornecedor: ");
				String nome = scan.nextLine();
				fornecedor.setNome(nome);
				System.out.println(" tipo: ");
				String tipo = scan.nextLine();
				fornecedor.setTipo(tipo);
				System.out.println(" cnpj: ");
				String cnpj = scan.nextLine();
				fornecedor.setCnpj(cnpj);
				System.out.println("Endereco: ");
				String endereco = scan.nextLine();
				fornecedor.setEndereco(endereco);
				System.out.println("Telefone: ");
				String telefone = scan.nextLine();
				fornecedor.setTelefone(telefone);
			
				daofornecedor.inserir(fornecedor);
				principal.main(null);
				//colocar para retornar para principal no final de cada um
			}if (op ==2) {
				listarCadastrosFornecedor();
				System.out.println("EXCLUIR CADASTRO");
				System.out.println("Insira o id do fornecedor a ser excluido: ");
				fornecedor.setId( scan.nextLong() );
				daofornecedor.excluir(fornecedor);
				principal.main(null);
			}
			if (op ==3) {
				listarCadastrosFornecedor();
				System.out.println("ALTERAR CADASTRO");
				System.out.println("Insira o Id do cadastro a ser alterado");	
				fornecedor.setId(scan.nextLong());
				System.out.println("Nome da fornecedor: ");
				String nome = scan.nextLine();
				fornecedor.setNome(nome);
				System.out.println(" tipo, 1 para fisica, 0 para juridica: ");
				String tipo = scan.nextLine();
				fornecedor.setTipo(tipo);
				System.out.println(" cnpj: ");
				String cnpj = scan.nextLine();
				fornecedor.setCnpj(cnpj);
				System.out.println("Endereco: ");
				String endereco = scan.nextLine();
				fornecedor.setEndereco(endereco);
				System.out.println("Telefone: ");
				String telefone = scan.nextLine();
				fornecedor.setTelefone(telefone);
				
				System.out.println("Alterando...");
				
				
				daofornecedor.alterar(fornecedor);
				
				
				principal.main(null);
			}
			
			if(op == 4) {
				listarCadastrosFornecedor();
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	public void listarCadastrosFornecedor() {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("LISTAR TODAS CIDADES");
		List<Fornecedor> cid = daofornecedor.buscar(); //estudar melhor o percorrer da lista
		
		for(Fornecedor fornecedor : cid) {
			System.out.println("Id: "+fornecedor.getId()+" Fornecedor: "+fornecedor.getNome());
		}
	}
//	public void listarCadastrosEstado() {
//		DAOEstado daoestado = new DAOEstado();
//		Estado estado = new Estado();
//		List<Estado> lista = daoestado.buscar();
//		
//		for (Estado est : lista) {
//			System.out.println("Id: "+est.getId()+" Estado: "+est.getNome()+" - "+est.getSigla());
//		}
	

}