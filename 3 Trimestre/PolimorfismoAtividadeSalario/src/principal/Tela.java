package principal;

public class Tela {
	private Salario salario;
	
	public Tela() {
		
	}
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.calcularSalarioFinal();
		func.calcularBonus();
		func.definirDesconto();
		
		Gerente ger = new Gerente();
		ger.calcularBonus();
	}
}
