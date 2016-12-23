package br.com.aula5a;

public class App1 {

	public static void main(String[] args) {

		ContaBancaria c = new ContaBancaria();

		c.setAtiva(true);
		c.setNumConta(258477);
		c.deposito(1000);
		c.sacar(1100);

		// System.out.println("Saldo R$: "+c.getSaldo());
	}
}
