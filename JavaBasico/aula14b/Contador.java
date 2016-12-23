package br.com.aula14b;

public class Contador{

	private int valor;
	
	public synchronized void incrmentar(){
		valor++;
	}
	
	public int getValor() {
		return valor;
	}
	
}
