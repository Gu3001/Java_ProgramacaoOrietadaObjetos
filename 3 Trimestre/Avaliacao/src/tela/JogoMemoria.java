package tela;

import java.awt.BorderLayout;
import java.awt.Color;
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
import tela.TelaFinal;

public class JogoMemoria extends JInternalFrame{//colocar internalFrame
	int pontos = 100;
	Random randomNumber = new Random(); //escolhendo aleatoriamente
	int Aleatorio[] = new int [16]; //criando lista de inteiro com 16 posi��es
	int posicaoDoVetorAleatorio[] = new int[16]; //outra lista com 16 posi��es
	
	//Barra de ferramenta
	private JPanel panel = new JPanel(); //defninil JPanel
	private GridLayout layoutDoJogo = new GridLayout(4,4);
	
	private JButton Escolha[] = new JButton[16]; //definindo bot�es para lista de escolhas
	
    private JPanel barraStatus = new JPanel(); //onde vai ficar a pontua��o
	private JLabel pontuacaoJogador = new JLabel("Pontos: 100"); 
	SistemaDePontuacao sist = new SistemaDePontuacao();
	
	//cria��o do Contrutror
	public JogoMemoria() {
		//serve para chamar o construtor da superclasse.
		super("Jogo da Mem�ria");
		
		//vai percorrer todas as 16 possibilidades
		for(int i=0; i<16; i++) {
			
			//instanciando objeto bot�o de outra classe
			BotaoPersonalizado btn = new BotaoPersonalizado();
			btn.botao();
			Escolha[i] = btn.botao();
			
			
			//adicionando em Panel as escolhas com bts
			panel.add(Escolha[i]);
			
			//escolha[i] � os bot�es
			
		}
		//panel do JPanel
		panel.setLayout(layoutDoJogo); //layoutDoJogo cont�m o grid
		add(panel, BorderLayout.CENTER);
		
		
		//barra de pontuacao
		
		barraStatus.add(pontuacaoJogador);
		add(barraStatus, BorderLayout.SOUTH);
		
		
		
		
 
		
		//instanciando objeto +++++++++++++++++++++++++++++
		EventosJogoDaMemoria handler = new EventosJogoDaMemoria();
		
		//percorrendo as 16 possibilidades
		for (int i=0; i<16; i++) {
			//a��o para cada bot�o
			Escolha[i].addActionListener(handler);
			
		}
		
		//configura��es de Janela
		//this=referencia classe/objeto sendo executado no momento
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para sair
		this.setResizable(false); //n�o redimensionavel
		this.setSize(500, 500);
		this.setVisible(true);
		
//		this.setLocationRelativeTo(null);//para centralizar
		
		

		
	}
	//fim do contrutor JogoMemoria()
	
	
	
	//implements = exporta comportamentos +++++++++++++++++++++
	private class EventosJogoDaMemoria implements ActionListener{
		
		int contAcertos, primeiroClick, segundoClick;
		int numeroClick, posi, cont, pontosAnterior;
		int partidasJogadas  = 0, numeroDeVitorias = 0;
		
		boolean novoJogo = true;
		boolean reiniciar = false;
		boolean fimDeJogo = false;
		
		@Override //talves n�o precisa do override
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
	                posi = 0; cont = 16;//importante
	                primeiroClick = 0;
	                segundoClick = 0;

	                for (int i=0; i<16; ++i){
	                    Escolha[i].setText("");
	                    //edi��o ativada
	                    Escolha[i].setEnabled(true);
	                }

	                if (reiniciar == false){
	                	//percorre bot�es com os n�meros aleat�rios
	                    for (int i=0; i<16; ++i){
	                        posicaoDoVetorAleatorio[i] = i;
	                    }
	                    //8 pares de bot�es
	                    //la�o de repeti��o para os bot�es que s�o 8 pares
	                    for (int i=0; i<8; ++i){
	                    	//aqui percorre os pares
	                        for (int j=0; j<2; ++j){
	                        	//sorteia nas 16 posi��es
	                            posi = randomNumber.nextInt(cont);//sorteando posi��o
	                            Aleatorio[posicaoDoVetorAleatorio[posi]] = i;//sorteia os dois bot�es nas posi��es de bot�es
	                            
	                            //posi��o < contador de 16 posi��es
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
		      //percorre bot�es, no vetor
		      for(int i =0; i<16; i++) {
		    	  	//mostrando escolha
					if (event.getSource() == Escolha[i]) 
					{	
						//no click aparece o n�mero
						Escolha[i].setText(String.valueOf(Aleatorio[i]));
						Escolha[i].setEnabled(false);
						Escolha[i].setVisible(true);
						numeroClick++;
						//sobe o n�mero de clicks
						
						if (numeroClick == 1) primeiroClick = i;
						if (numeroClick == 2) {
							segundoClick = i;
							//no caso de o usu�rio ERRAR
							if (Aleatorio[primeiroClick] != Aleatorio[segundoClick]) {
//								pontos-=2; //diminuir a pontua��o
								sist.contagemMenos();
								JOptionPane.showMessageDialog(JogoMemoria.this, "Errado");
								
						
								//esconde bot�es clicados
								Escolha[primeiroClick].setText("");
								Escolha[segundoClick].setText("");
								//enabled habilida edi��o do usu�rio, oculta bot�es caso errado
								Escolha[primeiroClick].setEnabled(true);
								Escolha[segundoClick].setEnabled(true);

							} else {
								sist.contagemMais();
								contAcertos ++;
//								pontos+=10;
							}
							numeroClick = 0;
						}
								
					}
				}
		      //seta os pontos
		      	
		      //------------------------comunica��o com sistema de pontua��o
	            pontuacaoJogador.setText("Pontos: " + sist.resultadoFinal());
	            

	            if (contAcertos== 8) {
	            	//concertar aqui, n�o est� dando mensagem de ganho
	        		
	            	JOptionPane.showMessageDialog(JogoMemoria.this,"Fim de jogo, voc� fez "+sist.resultadoFinal()+" pontos");
	            	TelaFinal teste = new TelaFinal("Parab�ns, Voc� Ganhou, At� mais!");
					teste.Testando();
					fimDeJogo = false;
					
				}
		      	
		}
		

			  
			  
			  
			  
			  
			  
			  
			  
	}
	
	
	
	public static void main(String[] args) {
		new JogoMemoria();
	}
	
	
}
