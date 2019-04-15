package controle;

public class VerificarPar {
	private int numero;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {//para inserir valores
		this.numero = numero; //this define o atributo
	}
	public boolean analisarPar() {
		return(numero % 2 == 0);
	}
	
}
