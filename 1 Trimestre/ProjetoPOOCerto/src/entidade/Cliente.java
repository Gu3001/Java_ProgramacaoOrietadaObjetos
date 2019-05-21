package entidade;

public class Cliente {
	private long id;
	private String nome;
	private String cpf;
	private Cidade idCidade;
	private Cidade nomeCidade;
	private Estado nomeEstado;
	private Estado siglaEstado;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cidade getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(Cidade idCidade) {
		this.idCidade = idCidade;
	}
	public Cidade getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(Cidade nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public Estado getNomeEstado() {
		return nomeEstado;
	}
	public void setNomeEstado(Estado nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	public Estado getSiglaEstado() {
		return siglaEstado;
	}
	public void setSiglaEstado(Estado siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
		
}
