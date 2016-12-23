package br.com.aula8d;

public class Pista {

	public void iniciar() throws PistaException{
		Automovel a1 = new Automovel() ;

		try {
			a1.acelerar(100);
			a1.acelerar(190);
		} catch (AcimaVelocidadeMaximaException e) {
			throw new PistaException("Problema na pista", e);
		} finally {
			System.out.println(a1.getVelocidadeAtual());
		}

	}

}
