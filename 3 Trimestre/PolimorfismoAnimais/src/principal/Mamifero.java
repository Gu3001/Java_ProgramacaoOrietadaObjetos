package principal;

public class Mamifero extends Animal implements AnimalAcao{
	private String corPelo;
	
	@Override
	public String locomover() {
		System.out.println("Correndo");
		return null;
	}

	@Override
	public String alimentar() {
		System.out.println("Mamando");
		return null;
	}

	@Override
	public String emitirSom() {
		System.out.println("Som de Mamífero");
		return null;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	

}
