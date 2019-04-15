package principal1;
import somar1.Somar1;
import somar1.Somar2;

public class Principal {
	public static void main(String[] args) {
		Somar1 soma = new Somar1();
		
		int result = soma.somar2(3,4);
		System.out.println(result);
		soma.somar1(3,3);
	}
}
