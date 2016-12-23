package jogodavelha;

import jogodavelha.io.Console;

public class Jogada {
	
	private int i;
	
	private int j;
	
	public int getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}
	
	public Jogada(String jogada) throws JogadaInvalidaException {
		parseString(jogada);
	}
	
	private void parseString(String jogada) throws JogadaInvalidaException{
		try {
			String[] tokens = jogada.split(",");
			
			this.i = Integer.parseInt(tokens[0].trim());
			this.j = Integer.parseInt(tokens[1].trim());
			
		} catch (Exception e) {
			throw new JogadaInvalidaException("A jogada eh invalida");
		}
	}
}
