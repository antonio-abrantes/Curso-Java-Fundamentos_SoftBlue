package br.com.aula7b;

public class Ferrari implements Carro, ItemCaro{
	

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari vierou a esquerda!");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari vierou a direita!");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou...");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari abriu a porta");
		
	}

	@Override
	public double getPreco() {
		return 1000000.00;
	}
	

}
