package banco;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		c1.depositar(1000);
		try {
			c1.sacarValor(2000);
			System.out.println(c1.getSaldo());
		} catch (SaldoInsufienteException e) {
			System.out.println(e.getMessage());
		}

		criarLista();
	}

	private static void criarLista() {
		List<ContaCorrente> lista = new ArrayList<>();
		lista.add(new ContaCorrente());
		lista.add(new ContaCorrente());
		lista.add(new ContaCorrente());

		for (ContaCorrente contaCorrente : lista) {
			contaCorrente.depositar(500);
			System.out.println(contaCorrente.getSaldo());
		}
	}
}
