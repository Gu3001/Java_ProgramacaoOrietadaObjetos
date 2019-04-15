package entidade;

public class Carro {
	
	private String nome;
	private String modelo;
	private String marca;
	private int ano;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		int idade = 2019 - ano; 
		return idade;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
