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
//		System.out.println("Salario Final Func: "+func.calcularSalarioFinal());
//		System.out.println("bônus Func: "+func.calcularBonus());
//		System.out.println("Desconto Func: "+func.definirDesconto());
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		f1.setSalario(15); //por hora?
		f1.setHorasTrabalhadas(160);
		f1.setTotalAdiantamento(150);
		f2.setSalario(15); //por hora?
		f2.setHorasTrabalhadas(160);
		f2.setTotalAdiantamento(150);
		
//		Funcionario f2 = new Funcionario();
//		Gerente g1 = new Gerente();

		Despesa d1 = new Despesa();
		d1.addDespesa(f1);
		d1.addDespesa(f2);
		
		
//		
//		totalAdiantamento
//		Gerente ger = new Gerente();
//		ger.calcularBonus();
		
	}
}
