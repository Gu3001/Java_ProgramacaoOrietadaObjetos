package tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TelaJogoDaVelha extends JFrame{
	JPanel pTela = new JPanel(new GridLayout(3,3,10,10));//margem entre célula de 10px
	
	//adicionando imagens dos botoes
	ImageIcon iconCirculo = new ImageIcon(getClass().getResource("/img/o.png"));
	ImageIcon iconX = new ImageIcon(getClass().getResource("/img/x.png"));
	
	//criando vetor para os botoes/bloco
	Bloco[] blocos = new Bloco[9]; // meus nove botões
	
	//para o caso de ninguem ganhar, contar rodadas
	int rodadas=0;
	
	//Atribuindo Constante, ainda tentando entender
	final int JOGADOR1 =1;
	final int JOGADOR2 =2;
	
	//controle de quem é a vez
	int jogadorVez = JOGADOR1;
	
	//inicializando jogador1
	JLabel lInformacao = new JLabel("Jogador "+JOGADOR1); //mostrar informação de quem está jogando, jogador 1 ou 2?
	
	//Meu construtor
	public TelaJogoDaVelha() {
		configurarTela();
		configurarJanela();
		
	}
	//configurando JPanel e JLabel
	public void configurarTela() {
		add(BorderLayout.CENTER,pTela); //adicionando no centro, tela
		add(BorderLayout.NORTH,lInformacao); //adicionando em Cima, label
		pTela.setBackground(Color.BLACK); //fundo preto, linhas
		
		lInformacao.setFont(new Font("ARIAL", Font.BOLD,30)); //configurando fonte
		lInformacao.setForeground(new Color(60,200,50)); //cor da letra
		lInformacao.setHorizontalAlignment(SwingConstants.CENTER); //Centralizando o texto
		
		for (int i = 0; i < 9; i++) {
			Bloco bloco = new Bloco();
			blocos[i] = bloco; //adicionando no vetor de blocos/botoes
			pTela.add(bloco); //adicionando na tela
		}
	}
	//método responsável por mudar a vez;
	public void mudarVez() {
		if (jogadorVez==1) {
			jogadorVez=2;
			lInformacao.setText("Jogador 2");
			lInformacao.setForeground(Color.RED);
		}else {
			jogadorVez=1;
			lInformacao.setText("Jogador 1");
			lInformacao.setForeground(new Color(60,200,50)); //verde
		}
	}
	//verificar se alguém venceu
	public boolean testarVitoria(int jog){
		//linha teste
		if (blocos[0].quemClicou==jog && blocos[1].quemClicou==jog && blocos[2].quemClicou==jog) {
			return true;
		}
		if (blocos[3].quemClicou==jog && blocos[4].quemClicou==jog && blocos[5].quemClicou==jog) {
			return true;
		}
		if (blocos[6].quemClicou==jog && blocos[7].quemClicou==jog && blocos[8].quemClicou==jog) {
			return true;
		}
		//coluna teste
		if (blocos[0].quemClicou==jog && blocos[3].quemClicou==jog && blocos[6].quemClicou==jog) {
			return true;
		}
		if (blocos[1].quemClicou==jog && blocos[4].quemClicou==jog && blocos[7].quemClicou==jog) {
			return true;
		}
		if (blocos[2].quemClicou==jog && blocos[5].quemClicou==jog && blocos[8].quemClicou==jog) {
			return true;
		}
		//paralelo teste
		if (blocos[0].quemClicou==jog && blocos[4].quemClicou==jog && blocos[8].quemClicou==jog) {
			return true;
		}
		if (blocos[6].quemClicou==jog && blocos[4].quemClicou==jog && blocos[2].quemClicou==jog) {
			return true;
		}
		return false; //caso contrário ninguem ganhou
		
		
		
	}
	
	
	//minha configuração de janela
	public void configurarJanela() {
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//método principal
	public static void main(String[] args) {
		new TelaJogoDaVelha();
	}
	//personalizando meus botoes, herdando caracteristicas do JButton
	public class Bloco extends JButton{
		int quemClicou = 0;
		public Bloco() {
			 //0=niguem, 1=jogador1, 2=jogador2;
			setBackground(Color.WHITE);
			
			//adicionando acao
			addActionListener(e-> { //resumindo o action listener, nova forma
					if (quemClicou ==0) {
						if (jogadorVez ==JOGADOR1) {
							setIcon(iconCirculo);
							quemClicou = JOGADOR1;
							
						}else {//ou jogador 2
							setIcon(iconX);
							quemClicou = JOGADOR2;
						}
						if (testarVitoria(quemClicou)) {
							JOptionPane.showConfirmDialog(null, "Jogador "+ quemClicou +" venceu");
							System.exit(0);//saindo
						};
						rodadas++;
						if (rodadas ==9) {
							JOptionPane.showConfirmDialog(null, "Deu velha!!! ");
							System.exit(0);
						}
						mudarVez();
					}
					
			});
			//----------
			
		}
	}

}
