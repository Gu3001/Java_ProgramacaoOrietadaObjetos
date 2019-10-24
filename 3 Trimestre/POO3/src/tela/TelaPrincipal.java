package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame implements ActionListener{
	//criar janela principal com os menus jogos utilitários e ajuda
	//para os jogos possuir dois itens, jogo da velha e forca
	//para utilitarios coloque uma calculadora
	//para ajuda, defina um JFrame com as informações do projetp
	
	private JMenuBar jmb = new JMenuBar();
	private JMenu jogos = new JMenu("Jogos");
	private JMenu utilitarios = new JMenu("Utilitarios");
	private JMenu ajuda = new JMenu("Ajuda");
	
	
	private JMenuItem jogoVelha = new JMenuItem("Jogo da Velha");
	private JMenuItem jogoForca = new JMenuItem("Jogo da Forca");
	private JMenuItem calculadora = new JMenuItem("Calculadora");
	private JMenuItem informacoes = new JMenuItem("Ajuda");
	
	
	private JDesktopPane desk = new JDesktopPane();
//	private TelaJogoVelha tjv;
	private TelaJogoDaVelha tjv;
	private TelaJogoForca tjf;
//	private TelaCalculadora tc;
	private Calculadora tc;
	private TelaAjuda ta;
	
	public TelaPrincipal() {
		setSize(800,600);
		
		setJMenuBar(jmb);
		
		jmb.add(jogos);
		jmb.add(utilitarios);
		jmb.add(ajuda);
		
		jogos.add(jogoVelha);
		jogos.add(jogoForca);
		
		utilitarios.add(calculadora);
		ajuda.add(informacoes);
		
		jogoVelha.addActionListener(this);
		jogoForca.addActionListener(this);
		calculadora.addActionListener(this);
		ajuda.addActionListener(this);
		
		add(desk);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==jogoVelha) {
////			TelaJogoVelha tjv = TelaJogoVelha.criarTela();
//			if (tjv == null) {
//				tjv = new TelaJogoVelha();
//				desk.add(tjv);
//			}
//			
//		}
		if(e.getSource()==jogoVelha) {;
			if (tjv == null) {
				tjv = new TelaJogoDaVelha();
				desk.add(tjv);
			}
			
		}
		if(e.getSource() == jogoForca) {
			if (tjf == null) {
				TelaJogoForca tjf = new TelaJogoForca();
				desk.add(tjf);	
			}
			
		}
//		if(e.getSource() == calculadora) {
//			if (tc == null) {
//				TelaCalculadora tc = new TelaCalculadora();
//				desk.add(tc);	
//			}
//			
//		}
		if(e.getSource() == calculadora) {
			if (tc == null) {
				Calculadora tc = new Calculadora();
				desk.add(tc);	
			}
			
		}
		if(e.getSource() == informacoes) {
			if (ta == null) {
				TelaAjuda ta = new TelaAjuda();
				desk.add(ta);	
			}
			
		}
	
		
	}
}
