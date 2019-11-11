package tela;

public class CalcularImc {


	public double imcCalculo(double peso, double altura) {
		double imc = peso / Math.pow(altura, 2);
		
		return imc;
	}
}
