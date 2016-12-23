package br.com.aula7.questao2;

public class Main {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaCorrente();
		c1.depositar(500);
		System.out.println("Saldo: "+c1.getSaldo());
		
		ContaBancaria c2 = new ContaInvestimento();
		c2.depositar(500);
		System.out.println("Saldo: "+c2.getSaldo());
		
		c1.tranferir(150, c2);
		
		System.out.println("Saldo: "+c1.getSaldo());
		System.out.println("Saldo: "+c2.getSaldo());
		
		
		System.out.println("Saldo: "+c1.calcularSaldo());
		System.out.println("Saldo: "+c2.calcularSaldo());

	}

}
