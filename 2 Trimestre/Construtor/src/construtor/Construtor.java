package construtor;

public class Construtor {
	private int codigo;
	private String nome;
	
	public Construtor(int c, String n) {
		this.codigo = c;
		this.nome = n;
	}
	public static void main(String[] args) {
		Construtor p1 = new Construtor(1,"João");
		Construtor p2 = new Construtor(2,"Maria");
		
		System.out.println(p2.nome + p1.nome);
	}
	
	
	
}
