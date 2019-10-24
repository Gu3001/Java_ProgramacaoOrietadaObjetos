//package tela;
////botao x bolinha, diminuir a repetição de codigo, mecher com grid
//
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.swing.JButton;
//import javax.swing.JInternalFrame;
//
//public class TelaJogoVelha extends JInternalFrame implements ActionListener{
////	private static TelaJogoVelha tela; //modificador de acesso, STATIC: esse atributo pertence a classe e não objeto
////	private FlowLayout layout = new FlowLayout();
//	private GridLayout layout = new GridLayout(3,3);
//	private String valorAtual = "X";
//
//	
//	public TelaJogoVelha() {
//		
////		setLayout(layout);
////		super("Jogo da Velha", true, true, true);  //maximizar, minimizar, arrastar, fechar
//		super("jogo da Velha", true, true, true);
//		setLayout(layout);
//		setSize(400,300);
//		List<JButton> botoes = new ArrayList<JButton>();
//		JButton botao;
//		for(int i =0; i < 9; i++) {
//			botao = new JButton();
//			botoes.add(botao);
//			botao.addActionListener(this);
//			botao.setPreferredSize(new Dimension(50,50));
//
//			add(botao);
//			
//		}
//		
//		
//		
//		setVisible(true);
//		
//	}
////	public  criarTela() {
////		if(tela==null) {
////			tela = new TelaJogoVelha();
////		}
////		return tela;
////	}
//
//
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		JButton botaoClicado = (JButton) e.getSource();
////		if(valorAtual == "X") {
////			valorAtual = "O";
////			botao.setEnabled(false);
////		}else {
////			valorAtual = "X";
////			
////		}
//		valorAtual = valorAtual =="X" ? "O" :"X";
//		botaoClicado.setText(valorAtual);
//		
//	}
//
//}
