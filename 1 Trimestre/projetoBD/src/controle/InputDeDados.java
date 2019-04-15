package controle;

import javax.swing.JOptionPane;

public class InputDeDados {
	public String nome;
	public int rg;
	public int cpf;
	public int telefone;
	
	public String inserirNomeAntigo() {
		String nomeAntigo = JOptionPane.showInputDialog("Insira o nome Antigo ");
		return nomeAntigo;
	}
		
	public String inserirNome() {
		String nome = JOptionPane.showInputDialog("Insira seu Nome: ");
		return nome;
	}
	public int inserirRG() {
		String rgString = JOptionPane.showInputDialog("Insira seu RG: ");
		rg = Integer.parseInt(rgString);
		return rg;
	}
	public int inserirCPF() {
		String cpfString = JOptionPane.showInputDialog("Insira seu CPF: ");
		cpf = Integer.parseInt(cpfString);
		return cpf;
	}
	public int inserirTelefone() {
		String foneString = JOptionPane.showInputDialog("Insira seu telefone: : ");
		telefone = Integer.parseInt(foneString);
		return telefone;
	}
	public String inserirResposta() {
		String resposta = JOptionPane.showInputDialog("Quer inserir novamente? (S) para sim e (N) para não ");
		resposta = resposta.toLowerCase();
//		while(resposta.equals("s") || resposta != "n") {
//			resposta = JOptionPane.showInputDialog("TENTE NOVAMENTE, Insira sua resposta: (S) para sim e (N) para não");
//			resposta = resposta.toLowerCase();
//		}
		return resposta;
	}
	
	
	
	
	
	
	
	
	
//	String resposta = "s";
//	while(resposta.equals("s")){
//		
//
//		if (resposta.equals("n")){
//			break;
//		}
//		String nome = JOptionPane.showInputDialog("Insira seu Nome");
//		String rg = JOptionPane.showInputDialog("Insira o seu rg");
//		String cpf = JOptionPane.showInputDialog("Insira o seu cpf");
//		String telefone = JOptionPane.showInputDialog("Insira seu telefone");
//		resposta = JOptionPane.showInputDialog("Insira sua resposta S ou N");
//		
//		
//		
//		st.executeUpdate("INSERT INTO CLIENTE(NOME,RG,CPF,TELEFONE) VALUES('"+nome+"','"+rg+"','"+cpf+"','"+telefone+"')");


//	}
}
