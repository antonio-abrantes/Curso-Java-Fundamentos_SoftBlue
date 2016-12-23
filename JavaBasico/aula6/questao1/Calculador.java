package br.com.aula6.questao1;

public class Calculador {

	private Figura figura;
	
	public void CalculadorArea(Figura f){
		this.figura = f;
		System.out.println("Area da figura: "+f.calcularArea());
	}	
}
