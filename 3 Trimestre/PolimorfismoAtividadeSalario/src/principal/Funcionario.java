package principal;

public class Funcionario{
	protected double salario;
	protected int horasTrabalhadas;
	protected double totalAdiantamento;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getTotalAdiantamento() {
		return totalAdiantamento;
	}
	public void setTotalAdiantamento(double totalAdiantamento) {
		this.totalAdiantamento = totalAdiantamento;
	}
	
public double CalcularBonus() {
		
		Funcionario funcionario = new Funcionario();
		double salario = funcionario.getSalario();
		double horasTrabalhadas = funcionario.getHorasTrabalhadas();
		
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
	public double DefinirDesconto() {
		
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
	
	public double CalcularSalarioFinal() {
		return CalcularBonus() - DefinirDesconto();
	}
	
}
