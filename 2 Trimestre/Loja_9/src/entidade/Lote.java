package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Lote {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String dataValid;
	@ManyToOne
	private Produtos produtos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDataValid() {
		return dataValid;
	}
	public void setDataValid(String dataValid) {
		this.dataValid = dataValid;
	}
	public Produtos getProdutos() {
		return produtos;
	}
	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	
	
}
