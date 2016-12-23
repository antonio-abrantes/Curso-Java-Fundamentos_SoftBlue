package br.com.aula5a;

public class ContaBancaria {

	private int numConta;
	private boolean ativa;
	private double saldo;

	public void deposito(double valor) {
		if (valor < 0)
			return;
		else {
			this.saldo += valor;
		}
	}

	public void sacar(double valor) {
		if (valor < 0) {
			System.out.println("Valor de saque invalido...");
			return;
		} else {
			if (this.saldo < valor) {
				System.out.println("Saldo insuficiente");
				this.mostrarDados();
				return;
			}
			System.out.println("Saque de R$ " + valor + " realizando com sucesso...");
			this.saldo -= valor;
			this.mostrarDados();
		}
	}

	private void mostrarDados() {
		System.out.println("Saldo atual: R$: " + this.getSaldo());
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public double getSaldo() {
		return saldo;
	}

}
