package br.com.aula6d;

public class Preparador {

	public void prepararbebida(Bebida bebida){
		System.out.println("Preparando a bebida "+bebida.getNome());
		
		bebida.preparar();
		
		if(bebida.isAquecer()){
			System.out.println("Aquecendo a bebida "+ bebida.getNome());
		}
		
		System.out.println("Bebida foi preparada com sucesso...");
		
	}
}
