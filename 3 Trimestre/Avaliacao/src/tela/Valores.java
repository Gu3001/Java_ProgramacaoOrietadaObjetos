package tela;

public class Valores {
	String  classif = "";
	
	public String calcular(double imc) {
		if(imc < 18.5){
            classif=" Abaixo do peso";
        }
        else if(imc < 24.9){
        	 classif=" Peso ideal";
        }
        else if(imc < 29.9){
        	 classif=" Levemente acima do peso";
        }
        else if(imc < 34.9){
        	 classif=" Primeiro grau de obesidade";
        }
        else if(imc < 39.9){
        	 classif=" Segundo grau de obesidade";
        }
        else
        	 classif=" Obesidade m�rbida";
		return  classif;
		
	}
}
