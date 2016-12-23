package br.com.aula6.questao3;

public class Main {

	public static void main(String[] args) {

		Veiculo v1 = new Automovel();
		v1.ligar();
		System.out.println(v1.isLigado());

		Veiculo v2 = new Motocicleta();
		v2.ligar();
		System.out.println(v2.isLigado());

		Veiculo v3 = new Onibus();
		v3.desligar();
		System.out.println(v3.isLigado());
		
		boolean b3 = v3 instanceof Object;
		
		System.out.println(b3);

	}
}
