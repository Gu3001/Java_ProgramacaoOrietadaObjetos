package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Preco {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String preco;
	private String dtInicio;
	private String dtFinal;
	@ManyToOne
	private Produtos produtos;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}
	public String getDtFinal() {
		return dtFinal;
	}
	public void setDtFinal(String dtFinal) {
		this.dtFinal = dtFinal;
	}
	public Produtos getProdutos() {
		return produtos;
	}
	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	
	
}
