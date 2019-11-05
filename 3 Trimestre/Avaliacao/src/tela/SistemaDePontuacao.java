package tela;

public class SistemaDePontuacao {
	
	int pontos= 100;
		
	public int contagemMais() {
		
		
		pontos+=10;
		return pontos;
		
	}
	public int contagemMenos() {
		
		
		pontos-=2;
		return pontos;
	}
	
	public int resultadoFinal(){
		return pontos;
	}
	
	

}
