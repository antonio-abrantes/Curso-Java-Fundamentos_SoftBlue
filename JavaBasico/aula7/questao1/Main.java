package br.com.aula7.questao1;

public class Main {

	public static void main(String[] args) {

		AreaCalculavel c = new Circunferencia(30);
		
		AreaCalculavel quad = new Quadrado(20);
		
		AreaCalculavel ret = new Retangulo(15, 30);
		
		
		System.out.println("Area da circunferencia: : "+c.calcularArea());
		
		System.out.println("Area do quadrado: "+quad.calcularArea());
		
		System.out.println("Area do retangulo: "+ret.calcularArea());

	}

}
