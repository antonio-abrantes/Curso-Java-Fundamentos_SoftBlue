package br.com.aula7.questao2;

public class ContaCorrente extends ContaBancaria{

	@Override
	public double calcularSaldo() {
		double desconto = (saldo * 10) / 100;
		saldo -= desconto;
		return saldo;
	}

}
