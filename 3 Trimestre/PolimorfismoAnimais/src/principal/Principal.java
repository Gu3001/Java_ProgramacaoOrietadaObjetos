package principal;

public class Principal {
	public static void main(String[] args) {
	Mamifero m = new Mamifero();
	Reptil r = new Reptil();
	Peixe p = new Peixe();
	Ave a = new Ave();
	Canguru canguru = new Canguru();
	Cachorro cachorro = new Cachorro();
	
	m.setPeso(33.5f);
	m.setCorPelo("Marrom");
	m.alimentar();
	m.locomover();
	m.emitirSom();
	System.out.println("--------------------------------");
	m.locomover();
	r.locomover();
	p.locomover();
	a.locomover();
	System.out.println("---2 instancia ------canguru não se locomove correndo----");
	canguru.locomover();
	cachorro.locomover();
	cachorro.emitirSom();
	}
	
	
}
