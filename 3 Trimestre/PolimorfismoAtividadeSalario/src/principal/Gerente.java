package principal;

public class Gerente extends Funcionario implements Salario{
	private int qtdeFuncionario;

	public int getQtdeFuncionario() {
		return qtdeFuncionario;
	}

	public void setQtdeFuncionario(int qtdeFuncionario) {
		this.qtdeFuncionario = qtdeFuncionario;
	}
	private int quantidadeFuncionario;
	
	public int getQuantidadeFuncionario() {
		return quantidadeFuncionario;
	}
	public void setQuantidadeFuncionario(int quantidadeFuncionario) {
		this.quantidadeFuncionario = quantidadeFuncionario;
	}

	@Override
public double calcularSalarioFinal() {
		
		return calcularBonus() - definirDesconto();

	}

//	@Override
//	public double calcularBonus() {
//		double total = (getSalarioHora() * getHorasTrabalhadas());
//
//		if (quantidadeFuncionario > 31) {
//			return total * 1.15;
//
//		}
//
//		else if (quantidadeFuncionario > 21 ) {
//			return total * 1.10;
//		}
//
//		else if (quantidadeFuncionario > 11) {
//			return total * 1.06;
//		}
//
//		else {
//			return total * 1.03;
//		}
//
//	}
//
//	@Override
//	public double definirDesconto() {
//
//		if (getTotalAtendimento() > 2001) {
//			return getTotalAtendimento() * 1.00;
//
//		}
//
//		else if (getTotalAtendimento() > 1501) {
//			return getTotalAtendimento() * 102;
//		}
//
//		else if (getTotalAtendimento() > 1001) {
//			return getTotalAtendimento() * 1.03;
//		}
//
//		else {
//			return getTotalAtendimento() * 1.01;
//		}
//
//	}
	

	
	
}
