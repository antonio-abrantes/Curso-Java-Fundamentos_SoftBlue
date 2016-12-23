package br.com.aula7.questao2;

public abstract class ContaBancaria {

	protected double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void depositar(double valor){
		saldo += valor;
	}
	
	public void sacar(double valor){
		saldo -= valor;
	}
	
	public void tranferir(double valor, ContaBancaria conta){
		sacar(valor);
		conta.depositar(valor);
	} 
	
	public abstract double calcularSaldo();
	
}
