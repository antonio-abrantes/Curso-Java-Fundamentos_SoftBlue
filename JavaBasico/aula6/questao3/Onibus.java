package br.com.aula6.questao3;

public class Onibus extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("O Onibus esta ligado...");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("O Onibus esta desligado...");
	}

}
