package br.com.aula7.questao3;

public class Porta implements Cloneable {
		
	private double altura;
	private double largura;
	private boolean aberta;
	
	public Porta(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}

	public double getLargura() {
		return largura;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void abrir(){
		aberta = true;
	}
	
	public void fechar(){
		aberta = false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Porta temp = new Porta(this.altura+1, this.largura);
		temp.aberta = true;
		return temp;
	}
	
}
