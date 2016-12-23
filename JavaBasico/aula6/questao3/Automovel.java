package br.com.aula6.questao3;

public class Automovel extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("O Automovel esta ligado...");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("O Automovel esta desligado...");
	}
	

	
	
}
