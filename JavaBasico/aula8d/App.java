package br.com.aula8d;

public class App {

	public static void main(String[] args) {

		Pista p = new Pista();
		try {
			p.iniciar();
		} catch (PistaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
