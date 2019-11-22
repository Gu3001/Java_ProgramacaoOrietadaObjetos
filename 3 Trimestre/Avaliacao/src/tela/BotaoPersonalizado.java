package tela;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;


public class BotaoPersonalizado extends JButton {
	private Font fonte = new Font("Lucida Console", Font.BOLD, 36);
	
	public BotaoPersonalizado() {
		
//		JButton botao = new JButton();
	    setBackground(Color.white);
		setFont(fonte);
		setVisible(true);
		
		
	}

}
