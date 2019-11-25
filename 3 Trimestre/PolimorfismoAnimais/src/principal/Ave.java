package principal;

public class Ave extends Animal implements AnimalAcao{
	private String corPena;

	@Override
	public String locomover() {
		System.out.println("Voanda");
		return null;
	}

	@Override
	public String alimentar() {
		System.out.println("Comendo Frutas");
		return null;
	}

	@Override
	public String emitirSom() {
		System.out.println("Som de Ave");
		return null;
	}
	
	public String fazerNinho() {
		System.out.println("Fazendo Ninho");
		return null;
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	

}
