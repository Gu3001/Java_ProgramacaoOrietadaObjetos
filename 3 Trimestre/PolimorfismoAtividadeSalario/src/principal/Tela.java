package principal;

public class Tela {
	private Salario salario;
	
	public Tela() {
		
	}
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setSalario(15); //por hora?
		func.setHorasTrabalhadas(160);
		func.setTotalAdiantamento(150);
		System.out.println("Salario Final Func: "+func.calcularSalarioFinal());
		System.out.println("bônus Func: "+func.calcularBonus());
		System.out.println("Desconto Func: "+func.definirDesconto());
		
		
		
//		
//		totalAdiantamento
		Gerente ger = new Gerente();
		ger.calcularBonus();
	}
}
