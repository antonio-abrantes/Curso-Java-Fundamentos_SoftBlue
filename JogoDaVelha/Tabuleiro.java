package jogodavelha;

public class Tabuleiro {

	private char[][] matriz;

	public Tabuleiro() {
		matriz = new char[3][3];
		zerar();
	}

	private void zerar() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = ' ';
			}
		}
	}

	public void imprimir() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				if (j < matriz[0].length - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < matriz.length - 1) {
				System.out.println("---------");
			}
		}
		System.out.println();
	}

	public boolean isCompleto(){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] == ' '){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean efetuarJogada(Jogada jogada, char simbolo) throws JogadaInvalidaException{
		int i = jogada.getI();
		int j = jogada.getJ();
		
		if(i <  0 || j < 0 || i >= matriz.length || j >= matriz[0].length){
			throw new JogadaInvalidaException("A jogada eh invalida");
		}
		
		if(matriz[i][j] != ' '){
			throw new JogadaInvalidaException("Esta jogda ja foi realizada");
		}
		
		matriz[i][j] = simbolo;
		
		return isSequenciaEncontrada();
	}
	
	private boolean isSequenciaEncontrada(){
		return true;
	}
	
}