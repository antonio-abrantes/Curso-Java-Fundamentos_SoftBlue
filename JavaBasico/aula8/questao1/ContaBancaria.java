package br.com.aula8.questao1;

public class ContaBancaria {

	private double saldo;

	public void depoistar(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor de deposito invalido!!", valor);
		}

		saldo += valor;
		// System.out.println("Deposito realizado com sucesso");
	}

	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficenteException {

		if (valor <= 0) {
			throw new ValorInvalidoException("Valor invalido!!", valor);
		}

		if (valor > this.saldo || saldo - valor < 0) {
			throw new SaldoInsuficenteException("Saldo insuficiente: ", valor);
		}

		saldo -= valor;

	}

	public void transferir(double valor, ContaBancaria c) throws ValorInvalidoException, SaldoInsuficenteException {

		this.sacar(valor);
		c.depoistar(valor);

	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
}
