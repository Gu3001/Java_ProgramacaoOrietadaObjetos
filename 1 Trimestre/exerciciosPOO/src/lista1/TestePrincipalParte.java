package lista1;

public class TestePrincipalParte {
	public static void main(String[] args) {
		TesteVerificarPar total = new TesteVerificarPar();
		
		TesteInsercoes nume1 = new TesteInsercoes();
		int num1 = nume1.inserirNum1();
		
		
		TesteInsercoes nume2 = new TesteInsercoes();
		int num2 = nume2.inserirNum2();
		
		
		total.setNumero1(num1);
		total.setNumero2(num2);
		
		System.out.println(total.getNumero1());
		System.out.println(total.getNumero2());
		
		System.out.println(total.somarNum());
		
	}
}
