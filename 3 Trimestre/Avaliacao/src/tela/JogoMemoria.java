package tela;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JogoMemoria extends JInternalFrame{//colocar internalFrame
	int pontos = 100;
	Random randomNumber = new Random(); //escolhendo aleatoriamente
	int Aleatorio[] = new int [16]; //criando lista de inteiro com 16 posições
	int posicaoDoVetorAleatorio[] = new int[16]; //outra lista com 16 posições
	
	//Barra de ferramenta
	private JPanel panel = new JPanel(); //defninil JPanel
	private GridLayout layoutDoJogo = new GridLayout(4,4);
	private Font fonte = new Font("Lucida Console", Font.BOLD, 36);
	private JButton Escolha[] = new JButton[16]; //definindo botões para lista de escolhas
	
    private JPanel barraStatus = new JPanel(); //onde vai ficar a pontuação
	private JLabel pontuacaoJogador = new JLabel("Pontos: 100"); 
	
	//criação do Contrutror
	public JogoMemoria() {
		//serve para chamar o construtor da superclasse.
		super("Jogo da Memória");
		
		//vai percorrer todas as 16 possibilidades
		for(int i=0; i<16; i++) {
			
			Escolha[i] = new JButton();
			//adicionando em Panel as escolhas com bts
			panel.add(Escolha[i]);
			Escolha[i].setFont(fonte);
			Escolha[i].setVisible(true);
			
		}
		
		panel.setLayout(layoutDoJogo); //layoutDoJogo contém o grid
		add(panel, BorderLayout.CENTER);
		
		//barra de pontuacao
		barraStatus.add(pontuacaoJogador);
		add(barraStatus, BorderLayout.SOUTH);
		
		//instanciando objeto +++++++++++++++++++++++++++++
		EventosJogoDaMemoria handler = new EventosJogoDaMemoria();
		//percorrendo as 16 possibilidades
		for (int i=0; i<16; i++) {
			Escolha[i].addActionListener(handler);
			
		}
		
		//configurações de Janela
		//this=referencia classe/objeto sendo executado no momento
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para sair
		this.setResizable(false); //não redimensionavel
		this.setSize(500, 500);
		this.setVisible(true);
//		this.setLocationRelativeTo(null);//para centralizar
		
		

		
	}
	//fim do contrutor JogoMemoria()
	
	
	
	//implements = exporta comportamentos +++++++++++++++++++++
	private class EventosJogoDaMemoria implements ActionListener{
		int contAcertos, primeiroClick, segundoClick;
		int numeroClick, posi, cont, pontosAnterior, MaiorPontuacao;
		
		int partidasJogadas  = 0, numeroDeVitorias = 0;
		boolean novoJogo = true;
		boolean reiniciar = false;
		boolean fimDeJogo = false;
		
		@Override //talves não precisa do override
		public void actionPerformed(ActionEvent event) {
//            if (event.getSource() == Button_Novo_Jogo){
//                Novo_Jogo = true;
//                Re_Iniciar = false;
//            }
		      if (novoJogo == true){

	                contAcertos = 0;
	                partidasJogadas++;
	                pontosAnterior = pontos;
	                pontos = 100;
	                numeroClick = 0;
	                posi = 0; cont = 16;
	                primeiroClick = 0;
	                segundoClick = 0;

	                for (int i=0; i<16; ++i){
	                    Escolha[i].setText("");
	                    //edição ativada
	                    Escolha[i].setEnabled(true);
	                }

	                if (reiniciar == false){

	                    for (int i=0; i<16; ++i){
	                        posicaoDoVetorAleatorio[i] = i;
	                    }

	                    for (int i=0; i<8; ++i){
	                        for (int j=0; j<2; ++j){
	                            posi = randomNumber.nextInt(cont);
	                            Aleatorio[posicaoDoVetorAleatorio[posi]] = i;

	                            if (posi < cont){
	                                for (int q=(posi+1); q<(cont); ++q){
	                                    posicaoDoVetorAleatorio[q-1] = posicaoDoVetorAleatorio[q];
	                                    
	                                }
	                            } cont--;
	                        }
	                    }
	                }
	                novoJogo = false;
	            }
		      for(int i =0; i<16; i++) {
					if (event.getSource() == Escolha[i]) {
						Escolha[i].setText(String.valueOf(Aleatorio[i]));
						Escolha[i].setEnabled(false);
						Escolha[i].setVisible(true);
						numeroClick++;
						
						if (numeroClick == 1) primeiroClick = i;
						if (numeroClick == 2) {
							segundoClick = i;
							if (Aleatorio[primeiroClick] != Aleatorio[segundoClick]) {
								pontos-=2;
								JOptionPane.showMessageDialog(JogoMemoria.this, "Errado");
								Escolha[primeiroClick].setText("");
								Escolha[segundoClick].setText("");
								//enabled habilida edição do usuário
								Escolha[primeiroClick].setEnabled(true);
								Escolha[segundoClick].setEnabled(true);

							} else {
								contAcertos ++;
								pontos+=10;
							}
							numeroClick = 0;
						}
								
					}
				}
	            if (pontos < 0) pontos = 0;
	            pontuacaoJogador.setText("Pontos: " + pontos);
	            
	            if (fimDeJogo == true) {
	            	//concertar aqui, não está dando mensagem de ganho
	            	JOptionPane.showMessageDialog(JogoMemoria.this,"Fim de jogo, você fez "+pontos+" pontos");
					fimDeJogo = false;
				}
		      	
		}
		

			  
			  
			  
			  
			  
			  
			  
			  
	}
	
	
	
	public static void main(String[] args) {
		new JogoMemoria();
	}
	
	
}
