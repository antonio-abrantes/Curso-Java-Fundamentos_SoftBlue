package br.com.aula4.questao3;

public class Main {

	public static void main(String[] args) {

		Triangulo triangulo = new Triangulo();
		System.out.println("Area do triangulo: "+triangulo.calcularArea());
		
		Quadrado quad = new Quadrado();
		System.out.println("Area do quadrado: "+quad.calcularArea() );
		
		
		Circunferencia circ = new Circunferencia();
		System.out.println("Area do circulo: "+circ.calcularArea());
		
		Trapezio trap = new Trapezio();
		System.out.println("Area do trapezio: "+trap.calcularArea());
		

	}

}
