package br.com.aula8a;

public class Banco {

	public void realizarOperacao() throws BancoException{
		
		Erros r = new Erros();
		r.setSaldo(2000);
		

			try {
				r.sacar(-200);
			} catch (ValorNegativoException e) {
				throw new BancoException("Erro de saque: valor negativo", e);
			} catch (SaldoInsuficienteException e) {
				throw new BancoException("Erro de saque: saldo insuficiente", e);
			}
			System.out.println("Saque realizado com sucesso..." );
		
		System.out.println("Saldo: R$ "+r.getSaldo());
	}
}
