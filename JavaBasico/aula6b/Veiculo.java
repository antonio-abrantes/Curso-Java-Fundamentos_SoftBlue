package br.com.aula6b;

public class Veiculo {

	protected String marca;
	
	public Veiculo(){
		System.out.println("Veiculo()");
	}
	
	public Veiculo(String marca){
		this.marca = marca;
		System.out.println("Veiculo(String)");
	}
}
