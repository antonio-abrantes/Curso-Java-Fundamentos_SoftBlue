package banco;

public class ContaCorrente extends Conta {

	@Override
	public void sacarValor(double valor) throws SaldoInsufienteException{
		if(getSaldo() - valor < 0){
			throw new SaldoInsufienteException("Saldo insuficiente");
		}
		
		setSaldo(getSaldo() - valor); 
		
	}

	@Override
	public void depositar(double valor) {
		//TODO
		
		setSaldo(getSaldo() + valor);
	}

}
