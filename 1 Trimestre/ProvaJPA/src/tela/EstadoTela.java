package tela;

import java.util.List;
import java.util.Scanner;

import dao.DAOEstado;
import entidade.Estado;

public class EstadoTela {
	
	public EstadoTela() {
//		Estado estado = new Estado();
//		DAOEstado daoestado = new DAOEstado();
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Insira o Nome: ");
//		String nome = scan.next();
//		estado.setNome(nome);
//		System.out.println("Insira a sigla: ");
//		String sigla = scan.next();
//		estado.setSigla(sigla);
//		daoestado.Inserir(estado);
		listar();
	}
	public void listar() {
		DAOEstado daoestado = new DAOEstado();
		List<Estado> est = daoestado.buscar();
		for(Estado estado : est) {
			System.out.println("Nome: "+estado.getNome()+" Sigla: "+estado.getSigla());
		}
		
	}

}
