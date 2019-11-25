package principal;

public class Peixe extends Animal implements AnimalAcao{
	private String corEscama;
	
	@Override
	public String locomover() {
		System.out.println("Nadando");
		return null;
	}

	@Override
	public String alimentar() {
		System.out.println("Comendo Substâncias");
		return null;
	}

	@Override
	public String emitirSom() {
		System.out.println("Peixe não faz Som");
		return null;
	}
	public String soltarBolha() {
		System.out.println("Soltou Bolha");
		return null;
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
