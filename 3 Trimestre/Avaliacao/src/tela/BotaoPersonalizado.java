package tela;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;


public class BotaoPersonalizado {
	private Font fonte = new Font("Lucida Console", Font.BOLD, 36);
	
	public JButton botao() {
		
		JButton botao = new JButton();
		botao.setBackground(Color.white);
		botao.setFont(fonte);
		botao.setVisible(true);
		return botao;
		
		
	}

}
