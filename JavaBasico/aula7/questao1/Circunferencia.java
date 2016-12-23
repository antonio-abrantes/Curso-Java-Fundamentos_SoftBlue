package br.com.aula7.questao1;

public class Circunferencia implements AreaCalculavel{

	static final double PI = 3.14;
	private double raio;
	
	public Circunferencia(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea(){
		return PI * Math.pow(raio, 2);
	}
}
