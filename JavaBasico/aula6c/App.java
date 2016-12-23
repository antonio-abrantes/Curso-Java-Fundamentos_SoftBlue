package br.com.aula6c;

public class App {

	public static void main(String[] args) {
	
//		Animal a = new Cachorro();
//		a.falar();
//		
//		if(a instanceof Cachorro){
//			Cachorro c = (Cachorro)a;
//			c.morder();
//		}		
//		boolean teste = a instanceof Cachorro;
//		System.out.println(teste);
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		falar(c);
		falar(g);
	}
	
	private static void falar(Animal a){
		a.falar();
	}

}
