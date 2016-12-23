package br.com.aula6.questao2;

public class Ponto2D {

	private double x;
	private double y;
	
	public Ponto2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toString(){
		return "x = " + x + ", y = " + y;
	}
}
