package br.com.aula8.questao1;

public class App {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria();
		c1.setSaldo(1000);
		
		ContaBancaria c2 = new ContaBancaria();		
		
		try {
			c1.sacar(100);
			System.out.println("Saque realizado com sucesso");
			c1.depoistar(-200);			
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (SaldoInsuficenteException e) {
			System.out.println(e.getMessage()+" Impossivel sacar "+e.getValor());
		} finally{
			System.out.println("Saldo: R$ "+c1.getSaldo());
		}
		
		try {
			c1.transferir(100, c2);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (SaldoInsuficenteException e) {
			System.out.println(e.getMessage()+" Impossivel transferir "+e.getValor());
		}finally{
			System.out.println("Conta 1: Saldo: R$ "+c1.getSaldo()+"\nConta 2: Saldo R$ "+c2.getSaldo());
		}
		
		
		try {
			c1.transferir(50, c2);
			System.out.println("Transfer�ncia de 50 de c1 para c2 feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValor());
		} catch (SaldoInsuficenteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getValor());
		}

	}

}
