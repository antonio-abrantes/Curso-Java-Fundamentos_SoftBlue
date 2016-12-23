package br.com.aula6.questao1;

public class FiguraComplexa extends Figura{
	private Figura[] figuras;
	
	public FiguraComplexa(Figura[] figura){
		this.figuras = figura;
	}
	
	@Override
	public double calcularArea() {
		double areaTotal = 0.0;
		
		for(int i = 0; i < figuras.length; i++){
			areaTotal += figuras[i].calcularArea();
		}
		
		return areaTotal;
	}
}
