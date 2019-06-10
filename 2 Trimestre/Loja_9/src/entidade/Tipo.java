package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Tipo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String tipo;
	private String subtipo;
	@ManyToOne
	private Produtos produtos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSubtipo() {
		return subtipo;
	}
	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}
	public Produtos getProdutos() {
		return produtos;
	}
	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	
	
}
