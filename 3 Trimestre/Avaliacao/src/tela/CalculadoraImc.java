package tela;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
 

public class CalculadoraImc extends JInternalFrame{
    private JTextField edtPeso;
    private JTextField edtAltura;
    private JButton btnCalcula;
    private JLabel lblPeso;
    private JLabel lblAltura;
    private JLabel lblResultado;
// Fazer a personaliza��o de campo (JTextField) e tamb�m verifica��o
// Se for n�mero, o campo fica azul, se for letra o campo fica vermelho
    public CalculadoraImc(){
    	super("Calculadora IMC", true, true, true, true);
        setConfig();
    }
 

    public void setConfig() {
    	//JOptionPane.showMessageDialog(null,"teste");
    	edtPeso = new JTextField();
        edtAltura = new JTextField();
        btnCalcula = new JButton("Calcular");
        lblPeso = new JLabel("Peso:");
        lblAltura = new JLabel("Altura:");
        lblResultado = new JLabel("Resultado: ");
         
        btnCalcula.addActionListener(new EventoCalculaIMC());
         
        add(lblPeso);
        add(lblAltura);
        add(edtPeso);
        add(edtAltura);
        add(lblResultado);
        add(btnCalcula);
        
        // Defini��es da janela
        setSize(605, 150);
        setLayout(new GridLayout(0, 2));
        setVisible(true);
    }
 
    public class EventoCalculaIMC implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
 
                double peso = Double.parseDouble(edtPeso.getText());
                double altura= Double.parseDouble(edtAltura.getText());
                double imc = peso / Math.pow(altura, 2);
 
                //objeto para formatar saida, com uma decimal
                DecimalFormat df = new DecimalFormat("#0.0");
 
                String resultado="Resultado: "+df.format(imc);
                 
                //abaixo comparo valor do imc e concatena a string resultado
                if(imc < 18.5){
                    resultado+=" Abaixo do peso";
                }
                else if(imc < 24.9){
                    resultado+=" Peso ideal";
                }
                else if(imc < 29.9){
                    resultado+=" Levemente acima do peso";
                }
                else if(imc < 34.9){
                    resultado+=" Primeiro grau de obesidade";
                }
                else if(imc < 39.9){
                    resultado+=" Segundo grau de obesidade";
                }
                else
                    resultado+=" Obesidade m�rbida";
 
                lblResultado.setText(resultado);
 
            }catch (ArithmeticException ar) {
                JOptionPane.showMessageDialog(null, "Erro aritm�tico, causa: "+ar.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro desconhecido, causa: "+ex.getMessage());
            }
        }
    }
 
    public static void main(String[] args) {
        new CalculadoraImc();
    }
}