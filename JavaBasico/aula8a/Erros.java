package br.com.aula8a;

public class Erros {

	
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double saldo) throws ValorNegativoException, SaldoInsuficienteException{
		
		if(saldo <= 0){
			throw new ValorNegativoException(saldo);
		}
		
		if(this.saldo - saldo < 0){
			throw new SaldoInsuficienteException(saldo, this.saldo);
		}
		
		this.saldo -= saldo;
	}
}
