package principal;

public class Funcionario implements Salario{
	protected double salario;
	protected double horasTrabalhadas;
	protected double totalAdiantamento;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getTotalAdiantamento() {
		return totalAdiantamento;
	}
	public void setTotalAdiantamento(double totalAdiantamento) {
		this.totalAdiantamento = totalAdiantamento;
	}

	
	

	@Override
	public double calcularBonus() {
		System.out.println("Calculando Bônus de Funcionario");

		System.out.println(salario +horasTrabalhadas);
		double total = salario * horasTrabalhadas;
		if (total > 2.001) {
			total *=1.05;
		}else if(total > 1.501) {
			total *=1.03;
		}else if(total > 1.001) {
			total *=1.02;
		}else {
			total *=1.01;
		}
		return total;
		
	}
	@Override
	public double definirDesconto() {
		System.out.println("Calculando Desconto de Funcionario");
		if (totalAdiantamento > 501) {
			return totalAdiantamento * 1.05;
			
		}else if(totalAdiantamento > 301) {
			return totalAdiantamento * 1.03;
		}else if(totalAdiantamento > 101) {
			return totalAdiantamento * 1.02;
		}else {
			return totalAdiantamento * 1.01;
		}
		
	}
	@Override
	public double calcularSalarioFinal() {
		System.out.println("Calculando Salário Final de Funcionario");
		return calcularBonus() - definirDesconto();
	}
	
}
