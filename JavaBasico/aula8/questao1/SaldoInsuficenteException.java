package br.com.aula8.questao1;

@SuppressWarnings("serial")
public class SaldoInsuficenteException extends Exception {

	private double valor;

	public SaldoInsuficenteException(String message, double valor) {
		super(message);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
