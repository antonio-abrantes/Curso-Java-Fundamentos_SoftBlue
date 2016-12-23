package br.com.aula6.questao3;

public class Motocicleta extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("A motocicleta esta ligada...");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("A motocicleta esta desligada...");
	}
}
