package tela;

public class EstadoTela2 {
	public EstadoTela2(){
		List<Estado> est = daoestado.buscar();
		for(Estado estado: est) {
			System.out.println(estado.getNome());
		}
	}
}
