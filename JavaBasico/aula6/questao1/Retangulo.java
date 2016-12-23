package br.com.aula6.questao1;

public class Retangulo extends Figura{
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {		
		return base * altura;
	}
	
}
