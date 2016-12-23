package br.com.aula8a;

public class ValorNegativoException extends Exception {

	private double valor;

	public ValorNegativoException(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
}
