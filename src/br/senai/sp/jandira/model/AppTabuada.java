package br.senai.sp.jandira.model;

public class AppTabuada {

	public static void main(String[] args) {
		  
		  ContaTabuada x = new ContaTabuada();
		  x.setMultiplicando(8);
		  x.setMaximoMultiplicador(10);
		  
		  String tabuadaX[] = x.calcular();
		  
		  for (int i = 0; i < tabuadaX.length; i++) {
			  System.out.println(tabuadaX[i]);
		  }

	}

}
