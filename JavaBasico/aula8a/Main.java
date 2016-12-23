package br.com.aula8a;

public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco();

			try {
				banco.realizarOperacao();
			} catch (BancoException e) {
				
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			} 
	}

}
