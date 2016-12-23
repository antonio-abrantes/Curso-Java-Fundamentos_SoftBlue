package br.com.aula4.questao2;

public class Main {

	public static void main(String[] args) {

		Fracao f1 = new Fracao();
		f1.definirValores(4, 5);
		
		Fracao f2 = new Fracao();
		f2.definirValores(4, 6);
		
		Fracao f3 = f1.multiplicar(f2);
		
		System.out.println("Fracao: "+f3.obterFracao());
		
		System.out.println("Resultado: "+f3.calcularValor());
	}
}
