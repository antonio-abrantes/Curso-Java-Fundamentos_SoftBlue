package br.com.aula14b;

public class Aplicacao {

	public static void main(String[] args) throws Exception{
		
		MyThread[] thre = new MyThread[1000];
		
		Contador c1 = new Contador();

		for (int i = 0; i < thre.length; i++) {
			thre[i] = new MyThread(c1);
		}
		
		for (int i = 0; i < thre.length; i++) {
			thre[i].start();
		}
		
		for (int i = 0; i < thre.length; i++) {
			thre[i].join();
		}
		
		System.out.println("Valor = "+c1.getValor());

	}

}
