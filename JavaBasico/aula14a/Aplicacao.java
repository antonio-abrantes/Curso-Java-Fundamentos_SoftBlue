package br.com.aula14a;

public class Aplicacao {

	public static void main(String[] args) {
		
		Contador1 c1 = new Contador1();
		c1.start();
		
		Contador2 c2 = new Contador2();
		Thread t = new Thread(c2);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(""+i);
		}

	}

}
