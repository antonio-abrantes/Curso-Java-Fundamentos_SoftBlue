package br.com.aula12.questao1;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		char[][] tabuleiro = new char[3][3];
		
		for(int i = 0; i < tabuleiro.length; i++){
			for(int j = 0; j < tabuleiro[i].length; j++){
				tabuleiro[i][j] = ' ';
			}
		}
		
		List<int[]> jogadas = new ArrayList<int[]>();
		
		jogadas.add(new int[] { 1, 1, 'X' });
		jogadas.add(new int[] { 2, 2, 'O' });
		jogadas.add(new int[] { 2, 0, 'X' });
		jogadas.add(new int[] { 0, 2, 'O' });
		jogadas.add(new int[] { 1, 2, 'X' });
		jogadas.add(new int[] { 1, 0, 'O' });
		
		for(int[] jogada : jogadas){
			int linha = jogada[0];
			int coluna = jogada[1];
			char simbolo = (char)jogada[2];
			tabuleiro[linha][coluna] = simbolo;
		}
		
		for(int i = 0; i < tabuleiro.length; i++){
			for(int j = 0; j < tabuleiro[i].length; j++){
				 System.out.print(tabuleiro[i][j]+" ");
			}
			System.out.println();
		}
	}
}
