package principal;

public class Reptil extends Animal implements AnimalAcao{
	private String corEscama;
	
	@Override
	public String locomover() {
		System.out.println("Rastejando");
		return null;
	}

	@Override
	public String alimentar() {
		System.out.println("Comendo Vegetais");
		return null;
	}

	@Override
	public String emitirSom() {
		System.out.println("Som de réptil");
		return null;
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
