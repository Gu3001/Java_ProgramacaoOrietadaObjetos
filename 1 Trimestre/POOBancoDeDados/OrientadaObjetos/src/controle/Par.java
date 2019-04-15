//atributo privado, enpsula para poder utilizar métodos
package controle;

public class Par {
	public static void main(String[] args) {
		VerificarPar par = new VerificarPar();
//		par.setNumero(3); //inserindo numero
//		if(par.analisarPar()) {
//			System.out.println("Par");
//		} else {
//			System.out.println("Impar");
//		}
		
		VerificarPar p1 = new VerificarPar();
		p1.setNumero(10);
		System.out.println(p1.analisarPar());
		
		VerificarPar p2 = new VerificarPar();
		p2.setNumero(3);
		System.out.println(p2.analisarPar());
		
		
		
		
		if(p1.analisarPar()) {//chamando método
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		if(p2.analisarPar()) {//chamando método
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}
