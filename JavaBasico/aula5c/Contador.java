package br.com.aula5c;

public class Contador {
	
	private static int valor;
	private int id;
	
	public int getId() {
		return id;
	}

	public Contador(int id){
		this.valor = 1;
		this.id = id;
	}
	
	public void incrementar(){
		this.valor++;
	}

	public int getValor() {
		return valor;
	}
}
