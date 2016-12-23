package br.com.aula5.questao1;

public class Lampada {

	private boolean ligada;
	
	public Lampada(boolean estado){
		this.ligada = estado;
	}
	
	public void ligar(){
		if(!this.ligada){
			this.ligada = true;
		}else{
			System.out.println("A lampada já esta desligada!");
		}
	}
	
	public void desligar(){
		if(this.ligada){
			this.ligada = false;
		}else{
			System.out.println("A Lampada já esta ligada!");
		}
	}
	
	public void imprimir(){
		if(this.ligada){
			System.out.println("Lampada ligada!");
		}else{
			System.out.println("Lampada desligada");
		}
	}	
}
