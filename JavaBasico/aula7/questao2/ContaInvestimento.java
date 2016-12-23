package br.com.aula7.questao2;

public class ContaInvestimento extends ContaBancaria {

	@Override
	public double calcularSaldo() {
		double bonus = (saldo * 5) / 100;
		saldo += bonus;
		return saldo;
	}

}
