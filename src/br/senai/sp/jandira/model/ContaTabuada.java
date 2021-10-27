package br.senai.sp.jandira.model;

public class ContaTabuada {

	private int multiplicando;
	private int maximoMultiplicador;
	private int contador = 0;

	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}

	public int getMultiplicando() {
		return multiplicando;
	}

	public void setMaximoMultiplicador(int maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public int getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public String[] calcular() {

		String t[] = new String[maximoMultiplicador + 1];

		while (contador <= maximoMultiplicador) {
			int produto = multiplicando * contador;

			t[contador] = multiplicando + " X " + contador + " = " + produto;

			contador++;
		}
		return t;

	}

}
