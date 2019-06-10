package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class ItensCompra {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long qtde;
	private double valor;
	
	@ManyToOne
	private Produtos produtos;
	
	@ManyToOne
	private Compra compra;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQtde() {
		return qtde;
	}

	public void setQtde(long qtde) {
		this.qtde = qtde;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	
	
}
