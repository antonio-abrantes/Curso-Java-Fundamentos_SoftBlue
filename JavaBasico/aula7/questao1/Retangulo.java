package br.com.aula7.questao1;

public class Retangulo implements AreaCalculavel{
	
	private double base;
	private double altura;	
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}
	
}
