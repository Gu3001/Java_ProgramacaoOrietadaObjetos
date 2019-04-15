package controle;

public class Principal {
	public static void main(String[] args) {
		Positivo p = new Positivo(); //criando objeto, instânciando objeto
//		p.numero = 10; //número é o atributo
		p.setNumero(5);//50 não vai aceitar, pois é entre -10 e 10
		if(p.verificar()) {//chamando método
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
	}
}
