package entidade;

public class Hospedagem {
	
	private int id;
	private String nome;
	private Double valorTotal;
	private int quantQuartos;
	private String cidade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public int getQuantQuartos() {
		return quantQuartos;
	}
	public void setQuantQuartos(int quantQuartos) {
		this.quantQuartos = quantQuartos;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
