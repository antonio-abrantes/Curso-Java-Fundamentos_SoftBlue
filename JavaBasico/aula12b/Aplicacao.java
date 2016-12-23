package br.com.aula12b;

public class Aplicacao {

	public static void main(String[] args) {
		
		imprimir("Antonio", "Ana Paula");
		imprimir();
		
	}
	
	private static void imprimir(String... s1){

		try {
			System.out.println(s1[0]);
		} catch (Exception e) {
			System.out.println("Vazio");
		}
	}	
}
