package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame implements ActionListener{
	
	private JMenuBar jmb = new JMenuBar();
	private JMenu aplicacoes = new JMenu("Aplicações");
	
	private JMenuItem calculadoraImc = new JMenuItem("Calculadora de IMC");
	private JMenuItem jogoMemoria = new JMenuItem("Jogo da Memória");
	
	private JDesktopPane desk = new JDesktopPane();
	private CalculadoraImc ci;
	private JogoMemoria jdm;
	
	

	public Principal() {
		
		setSize(800, 600);
		setJMenuBar(jmb);
		
		jmb.add(aplicacoes);
		
		aplicacoes.add(calculadoraImc);
		aplicacoes.add(jogoMemoria);
		
		calculadoraImc.addActionListener(this);
		jogoMemoria.addActionListener(this);
		
		add(desk);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Principal();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == calculadoraImc) {
			if (ci == null) {
				ci = new CalculadoraImc();
				desk.add(ci);
			}
		}
		if(e.getSource() == jogoMemoria) {
			if (jdm == null) {
				jdm = new JogoMemoria();
				desk.add(jdm);
			}
			
		}
	
		
		
		
	}
	
	
}
