package br.com.aula14a;

public class Contador2 implements Runnable{
	
	private void execucao(){
		for (int i = 0; i < 10; i++) {
			System.out.println("2 => "+i);
		}
	}

	@Override
	public void run() {
		execucao();
	}

}
