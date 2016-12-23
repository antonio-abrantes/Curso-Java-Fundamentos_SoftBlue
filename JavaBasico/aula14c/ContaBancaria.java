package br.com.aula14c;

public class ContaBancaria {
	
	private double saldo = 1000;
	
	private final Object monitor = new Object();
	
	public synchronized void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor){
		synchronized (monitor) {
			saldo += valor;
		}	
	}
	
	public double getSaldo() {
		return saldo;
	}

}
