package tela;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
 
 //Atributos da classe, botoes
 
 JButton botao1, botao2, botao3, botao4, 
 botao5, botao6, botao7, botao8, botao9,
 botaoSoma, botaoSub, botaoMult, botaoDiv,
 botaoPonto, botaoZero, botaoIgual;
 
 //meu campo
 JTextField campo;
 
 
 public Calculadora() {
  //aprendido com o professor
  super("Calculadora");
  
  //IIniciando os objetos
  
  campo = new JTextField();//campo de texto
  campo.setEditable(false);//Essa calculadora funciona apenas com teclado virtual, pois foi desabilitado o fisisco
  //botões
  botao1 = new JButton("1");
  botao2 = new JButton("2");
  botao3 = new JButton("3");
  botao4 = new JButton("4");
  botao5 = new JButton("5");
  botao6 = new JButton("6");
  botao7 = new JButton("7");
  botao8 = new JButton("8");
  botao9 = new JButton("9");
  botaoZero = new JButton("0");
  botaoSoma = new JButton("+");
  botaoSub = new JButton("-");
  botaoMult = new JButton("*");
  botaoDiv = new JButton("/");
  botaoPonto = new JButton(".");
  botaoIgual = new JButton("=");
  
  //adicionando acoes para os botoes
  botao1.addActionListener(new Botao1Listener());
  botao2.addActionListener(new Botao2Listener());
  botao3.addActionListener(new Botao3Listener());
  botao4.addActionListener(new Botao4Listener());
  botao5.addActionListener(new Botao5Listener());
  botao6.addActionListener(new Botao6Listener());
  botao7.addActionListener(new Botao7Listener());
  botao8.addActionListener(new Botao8Listener());
  botao9.addActionListener(new Botao9Listener());
  botaoZero.addActionListener(new BotaoZeroListener());
  botaoSoma.addActionListener(new BotaoSomaListener());
  botaoSub.addActionListener(new BotaoSubListener());
  botaoMult.addActionListener(new BotaoMultListener());
  botaoDiv.addActionListener(new BotaoDivListener());
  botaoPonto.addActionListener(new BotaoPontoListener());
  botaoIgual.addActionListener(new BotaoIgualListener());
  
  
  //criando containers
  Container cPrincipal = getContentPane();
  Container cSecundario = new Container();
  
  //criando o grid para a calculadora e os botoes
  cSecundario.setLayout(new GridLayout(4, 4));
  cSecundario.add(botao7);
  cSecundario.add(botao8);
  cSecundario.add(botao9);
  cSecundario.add(botaoDiv);
  cSecundario.add(botao4);
  cSecundario.add(botao5);
  cSecundario.add(botao6);
  cSecundario.add(botaoMult);
  cSecundario.add(botao1);
  cSecundario.add(botao2);
  cSecundario.add(botao3);
  cSecundario.add(botaoSub);
  cSecundario.add(botaoZero);
  cSecundario.add(botaoPonto);
  cSecundario.add(botaoIgual);
  cSecundario.add(botaoSoma);
  
  // criando layout e suas configuracoes
  cPrincipal.setLayout(new BorderLayout());
  cPrincipal.add(BorderLayout.NORTH, campo); //adicionando o campo acima
  cPrincipal.add(BorderLayout.CENTER, cSecundario); //adicionando conteudo de botoes no centro
  
  //dapenas configutcoes da janela
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
  setSize(300, 300);
  
 }
 
 //acoes dos botoes sao configuradas abaixo, uma para cada tecla
 
 public class Botao1Listener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "1");
  } 
 }

 public class Botao2Listener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "2");
  } 
 }
 
 public class Botao3Listener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "3");
  }
 }

 public class Botao4Listener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "4"); 
  }
 }
 
 public class Botao5Listener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "5"); 
  }
 }

 public class Botao6Listener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "6");
  }
 }

 public class Botao7Listener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "7"); 
  }
 }
 
 public class Botao8Listener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "8"); 
  }
 }

 public class Botao9Listener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "9");
  }
 }

 public class BotaoZeroListener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
   campo.setText(campo.getText() + "0");
  }
 }

 public class BotaoSomaListener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
    campo.setText(campo.getText() + " + "); 
  }
 }
 
 public class BotaoSubListener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
    campo.setText(campo.getText() + " - ");
  }
 }
 
 public class BotaoMultListener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
    campo.setText(campo.getText() + " * ");
  }
 }

 public class BotaoDivListener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
    campo.setText(campo.getText() + " / ");
  }
 }

 public class BotaoPontoListener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
    campo.setText(campo.getText() + ".");
  }
 }

 //execucao das operacoes é feita abaixo
 public class BotaoIgualListener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
	  
   String [] tokens = campo.getText().split(" ");//criando e separando uma lista para cada item digitado
   double acumulador = 0; //acumulador criado
   String sinal = "";//registrador de sinal
   
   for(int i = 0; i < tokens.length; i++) { //percorre todo vetor
    if(i == 0) {
     acumulador = Double.parseDouble(tokens[i]);
     
    } else if(i % 2 == 1) {
     sinal = tokens[i];
     
    } else {
    	//somar
     if(sinal.contentEquals("+")) {
      acumulador += Double.parseDouble(tokens[i]);
      //subtrair
     } else if(sinal.contentEquals("-")) {
      acumulador -= Double.parseDouble(tokens[i]);
      //multiplicar
     } else if(sinal.contentEquals("*")) {
      acumulador *= Double.parseDouble(tokens[i]);
      //dividir
     } else {
       acumulador /= Double.parseDouble(tokens[i]);
      
     }
    }
   }

   campo.setText("" + acumulador);
   
  }
 
  }
  
 
 public static void main(String[] args) {
  new Calculadora();
  

 }

}