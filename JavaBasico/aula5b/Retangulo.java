package br.com.aula5b;

public class Retangulo {

	private double largura;
	private double altura;
	
	public Retangulo(){
		largura = 4;
		altura = 3;
		System.out.println("Area: "+ this.calcularArea());
	}
	
	private double calcularArea(){
		return largura * altura;
	}
	
	void calcularArea(int i){
		return;
	}
}

