package principal;

public class Canguru extends Mamifero{
	//estou sobrepondo o correr por saltar
	@Override
	public String locomover() {
		
		System.out.println("Saltando");
		return null;
	}
	public String usarBolsa() {
		
		System.out.println("Usando Bolsa");
		return null;
	}
}
