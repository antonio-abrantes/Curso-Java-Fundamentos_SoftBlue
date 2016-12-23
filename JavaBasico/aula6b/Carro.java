package br.com.aula6b;

public class Carro extends Veiculo{

		public Carro(){
			super("Ferrari");
			System.out.println("Carro()");
		}
		
		public Carro(String marca){
			super(marca);
		}
}
