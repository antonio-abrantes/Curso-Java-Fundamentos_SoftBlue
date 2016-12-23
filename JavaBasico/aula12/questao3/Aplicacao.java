package br.com.aula12.questao3;

public class Aplicacao {

	public static void main(String[] args) {
		Colecao c1 = new Pilha();
		manipularDados(c1);
		
		//Colecao c2 = new Fila();
		//manipularDados(c2);
	}
	
	private static void manipularDados(Colecao c){
		
		c.inserirItem("A");
		c.inserirItem("B");
		c.inserirItem("C");	
		c.mostrar();
		
		System.out.println("Removeu o "+c.removerItem());
		c.mostrar();
		
		System.out.println("Removeu o "+c.removerItem());
		c.mostrar();
		
		System.out.println("Removeu o "+c.removerItem());
		c.mostrar();
		
	}
	
}
