package br.com.aula7c;

public interface Automovel{
	
	void acelerar();
	void frear();
	
//	default void derrapar(){
//		acelerar();
//		acelerar();
//		frear();
//	}
//	
	default int getVelocidadeMax(double num){
		return 300;
	}
	
	static void printText(String text) {

		    System.out.println(text);
		  }

	
}
