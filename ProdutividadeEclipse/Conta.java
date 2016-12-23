package banco;

public abstract class Conta {
	
	private double saldo;
	
	public abstract void sacarValor(double valor) throws SaldoInsufienteException;
	
	public abstract void depositar(double valor);
	
	public double getSaldo() {
		return saldo;
	}
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
