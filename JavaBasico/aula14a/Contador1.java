package br.com.aula14a;

public class Contador1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("=> "+i);
		}
	}
}
