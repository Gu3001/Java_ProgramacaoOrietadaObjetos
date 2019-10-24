package tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;






public class JogoDaMemoria extends JInternalFrame {
	JPanel tela = new JPanel(new GridLayout(3,3,10,10));
	

//	
	
//	JLabel informacao = new JLabel("Jogador ");
	Botao[] botoes = new Botao[9];
	ImageIcon img1 = new ImageIcon(getClass().getResource("/imgs/1.jpg"));
	ImageIcon img2 = new ImageIcon(getClass().getResource("/imgs/2.png"));
	ImageIcon img3 = new ImageIcon(getClass().getResource("/imgs/3.png"));
	
	
	public JogoDaMemoria() {
		configurarJanela();
		configurarTela();
		
		
	}
	public void configurarJanela() {
		setTitle("Jogo da Memória");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,800);
//		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void configurarTela() {
		add(BorderLayout.CENTER,tela); //adicionando no centro, tela
//		add(BorderLayout.NORTH,Informacao); //adicionando em Cima, label
		tela.setBackground(Color.BLACK); //fundo preto, linhas
		
//		Botao botao = new Botao();
//		botoes[0] = botao;
//		tela.add(botao);
//		botao = new Botao();
//		botoes[1] = botao;
//		tela.add(botao);
//		botao = new Botao();
//		botoes[2] = botao;
//		tela.add(botao);
//		botao = new Botao();
//		botoes[3] = botao;
//		tela.add(botao);
//		botao = new Botao();
//		botoes[4] = botao;
//		tela.add(botao);
//		botao = new Botao();
//		botoes[5] = botao;
//		tela.add(botao);
//		botao = new Botao();
//		botoes[6] = botao;
//		tela.add(botao);
//		botao = new Botao();
//		botoes[7] = botao;
//		tela.add(botao);
//		botao = new Botao();
//		botoes[8] = botao;
//		tela.add(botao);
		
		for (int i = 0; i < 9; i++) {
			Botao botao = new Botao();
			botoes[i] = botao; //adicionando no vetor de Botaos/botoes
			tela.add(botao); //adicionando na tela
			
//			if (i % 2 == 0) {
//				botoes[i].setText("Java");
//			}else {
//				botoes[i].setText("Python");
//			}
			
		}
		botoes[0].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				botoes[0].setIcon(img1);
			}
		});
		botoes[1].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				botoes[1].setIcon(img1);
			}
		});
		botoes[2].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				botoes[2].setIcon(img1);
			}
		});
		botoes[3].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				botoes[3].setIcon(img2);
			}
		});
		botoes[4].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				botoes[4].setIcon(img2);
			}
		});
		botoes[5].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				botoes[5].setIcon(img2);
			}
		});
		botoes[6].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				botoes[6].setIcon(img3);
			}
		});
		botoes[7].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				botoes[7].setIcon(img3);
			}
		});
		botoes[8].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				botoes[8].setIcon(img3);
			}
		});
		
	}

//	public void actionPerformed(ActionEvent e) {
//        if( e.getSource() == botoes[0] ) {
//        	botoes[0].setIcon(img1);
//                    
//         } 
//   }
	
	public class Botao extends JButton{
		public Botao() {
			setBackground(Color.WHITE);
		}

	}
	
	
	public static void main(String[] args) {
		new JogoDaMemoria();
	}

}
