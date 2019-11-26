package principal;

public class Despesa{
	
	private double total;
	private double totalBonus;
	private double totalDesconto;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getTotalBonus() {
		return totalBonus;
	}

	public void setTotalBonus(double totalBonus) {
		this.totalBonus = totalBonus;
	}

	public double getTotalDesconto() {
		return totalDesconto;
	}

	public void setTotalDesconto(double totalDesconto) {
		this.totalDesconto = totalDesconto;
	}
	
	public void addDespesa(Salario p) {
		
		
		 p.calcularBonus() ;
		 p.definirDesconto() ;
		 p.calcularSalarioFinal() ;
		
		setTotal(getTotal() + p.calcularSalarioFinal());
		System.out.println(getTotal());
		
		setTotalDesconto(getTotalDesconto() + p.definirDesconto());
		System.out.println(getTotalDesconto());
		
		setTotalBonus(getTotalBonus() + p.calcularBonus());
		System.out.println(getTotalBonus());
		
	}
	

}
