package br.com.aula7.questao1;

public class Quadrado implements AreaCalculavel{
	
	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}
	
}
