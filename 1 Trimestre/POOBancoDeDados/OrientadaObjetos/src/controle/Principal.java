package controle;

public class Principal {
	public static void main(String[] args) {
		Positivo p = new Positivo(); //criando objeto, inst�nciando objeto
//		p.numero = 10; //n�mero � o atributo
		p.setNumero(5);//50 n�o vai aceitar, pois � entre -10 e 10
		if(p.verificar()) {//chamando m�todo
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
	}
}
