package controle;

//atributo armazenda
//m�todo processa

public class Positivo {//public todo mundo que � publico, modificador de acesso
	private int numero; //mais importante, caracteristica importante da classe
	//modificador de acesso / se tem retorno/ par�metro, d� o objetivo
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int novoValor) {
		if(novoValor<=10 || novoValor>= -10) {
			numero = novoValor;
		}
		numero = novoValor;
	}
	
	public boolean verificar() {
		if(numero >= 0) {
			return true;
		}else {
			return false;
		}
//		return numero >= 0;
	}
}
