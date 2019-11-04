package tela;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class TelaDeErro extends JPanel implements Runnable
{
private String text;
private float posicaoX;
private float posicaoY;

public TelaDeErro(String inText)
{
	text = inText;
	posicaoX = 25.0f;
	posicaoY = 25.0f;
}
//aqui onde tem a animação gráfica
public void paintComponent(Graphics g)
{
	super.paintComponent(g);
	Graphics2D g2 = (Graphics2D)g;
	g2.drawString(text, posicaoX, posicaoY);
}

public void run()
{
	try
	{
	while(true)
	{
	posicaoX += 2f;
	this.repaint();
	Thread.sleep(10);
	}
	}
	catch (InterruptedException ex)
	{
		ex.printStackTrace();
	}
}

public void Testando(){
	JFrame janela = new JFrame("Tela de Erro");
	TelaDeErro panel = new TelaDeErro("VOCÊ ERROU!");
	
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.getContentPane().add(panel);
	janela.setSize(800, 600);
	janela.setVisible(true);
	janela.show();
	Thread thread = new Thread(panel);
	thread.start();
	
	int delay = 1000;   // tempo de espera antes da 1ª execução da tarefa.
	int interval = 3000;
	// intervalo no qual a tarefa será executada.
	Timer timer = new Timer();
	timer.scheduleAtFixedRate(new TimerTask() {

		@Override
		public void run() {
			janela.setVisible(false);
			
		}
	  
	            
	  
	}, delay, interval);
	
	
}
}