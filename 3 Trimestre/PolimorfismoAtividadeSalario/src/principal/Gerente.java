package principal;

public class Gerente extends Funcionario implements Salario{
	private int qtdeFuncionario;

	public int getQtdeFuncionario() {
		return qtdeFuncionario;
	}

	public void setQtdeFuncionario(int qtdeFuncionario) {
		this.qtdeFuncionario = qtdeFuncionario;
	}
	
	@Override
	public double calcularBonus() {
		System.out.println("Calculando Bônus de Gerente");
		
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

	
	
}
