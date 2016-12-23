package br.com.aula6.questao3;

public abstract class Veiculo {

	private boolean ligado;

	public void ligar() {
		ligado = true;
	}

	public void desligar() {
		ligado = false;
	}

	public boolean isLigado() {
		return ligado;
	}
	
	public static void teste(){
		System.out.println("Testee");
	}
	
}
