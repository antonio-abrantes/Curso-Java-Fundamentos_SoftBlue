package br.com.aula6.questao1;

public class App {

	public static void main(String[] args) {
		
		Figura q1 = new Quadrado(3);
		Calculador calc = new Calculador();
		calc.CalculadorArea(q1);
		
		Figura r1 = new Retangulo(2.0, 7.0);
		calc.CalculadorArea(r1);
		
		Figura[] figuras = {q1, r1};
		
		FiguraComplexa figComp = new FiguraComplexa(figuras);
		calc.CalculadorArea(figComp);

	}

}
