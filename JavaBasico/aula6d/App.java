package br.com.aula6d;

public class App {

	public static void main(String[] args) {

		LeiteQuente leite = new LeiteQuente();

		Preparador preparador = new Preparador();
		preparador.prepararbebida(leite);
		
		Refrigerante refri = new Refrigerante();
		preparador.prepararbebida(refri);
	}

}
