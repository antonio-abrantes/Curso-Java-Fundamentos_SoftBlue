package br.com.aula12.questao1;

import java.util.Random;
import java.util.Scanner;

public class Acoes {
	
	//Medoto chamado dentro da verificacao de vencedor para definir se a string comparada corresponde ao jogador da vez
	private static boolean op(String vet, String a){
		if(vet.equals(a)){
			return true;
		}else{
			return false;
		}
	}
	//Metodo que verifica se algum dos jogadores ganhou a partida
	private static boolean verifica_vencedor(String[] vet, String a){
		
		//linhas
		for(int i = 0; i < 9; i = i + 3){
			if((vet[i] == vet[i+1] && vet[i+1] == vet[i+2]  && vet[i] != " " && vet[i+1] != " " && vet[i+2] != " ")){
				return op(vet[i], a);
			}
		}		
		//colunas
		if((vet[0] == vet[3] && vet[0] == vet[6]  && vet[0] != " " && vet[3] != " " && vet[6] != " ")){
			return op(vet[0], a);
		}
		if((vet[1] == vet[4] && vet[1] == vet[7]  && vet[1] != " " && vet[4] != " " && vet[7] != " ")){
			return op(vet[1], a);
		}
		if((vet[2] == vet[5] && vet[2] == vet[8]  && vet[2] != " " && vet[5] != " " && vet[8] != " ")){
			return op(vet[2], a);
		}
		
		//Diagonal principal
		if((vet[0] == vet[4] && vet[0] == vet[8]  && vet[0] != " " && vet[4] != " " && vet[8] != " ")){
			return op(vet[0], a);
		}
		
		//Diagonal secundaria
		if((vet[2] == vet[4] && vet[2] == vet[6]  && vet[2] != " " && vet[4] != " " && vet[6] != " ")){
			return op(vet[2], a);
		}
			
		return false;	
	}
	//Imprimir tela
	private static void imprimir(String[] vet){	
		for(int i = 0; i < 9; i = i+3){
			System.out.println("    "+vet[i]+" | "+vet[i+1]+" | "+vet[i+2]);
			if(i < 6){
				System.out.println("  -------------");
			}
		}	
	}
	
	//Unico metodo que tera chamada externa para entrada dos valores para a posicao de "X"
	public static void pega_jogada(String[] vet){
		while(true){
			Scanner in = new Scanner(System.in);
			int x = in.nextInt();
			int y = in.nextInt();
			int jogada;
			if(!verifica_jogo(vet)){
				jogada = jogada_pl(x, y, vet);
			}else{
				imprimir(vet);
				System.out.println("Fim de jogo, sem jogadas disponiveis");
				
				break;
			}
				
			if(jogada == 0){
				System.out.println("Jogador ganhou");
				imprimir(vet);
				break;
			}else if(jogada == 1){
				continue;
			}else if(jogada == -1){
				if(!verifica_jogo(vet)){
					jogada_pc(vet);
				}else{
					imprimir(vet);
					System.out.println("Fim de jogo, sem jogadas disponiveis");
					break;
				}
				
			}
			imprimir(vet);			
		}	
	} 
	//Metodo da entrada do jogador
	private static int jogada_pl(int x, int y, String[] vet){
		if(x == 1){
			x = y-1;
		}else if(x == 2){
			x = x + y;
		}else if(x == 3){
			x = x + 2 + y;
		}

		if(vet[x] == " "){
			vet[x] = "X";
			if(verifica_vencedor(vet, "X")){
				return 0;
			}
		}else{
			System.out.println("Jogada invalida...");
			return 1;
		}
		return -1;
	}
	//Metodo da jogada do PC
	private static void jogada_pc(String[] vet ){
		
		while(true){
			Random r = new Random();
			
			int i = r.nextInt(9);
			if(vet[i] == " "){
				vet[i] = "O";
				break;
			}			
		}
		if(verifica_vencedor(vet, "O")){
			System.out.println("Pc ganhou");
		}
	}
	
	//Metodo para verificar se ainda é possivel fazer jogadas...
	private static boolean verifica_jogo(String[] vet){
		for(int i = 0; i < 9; i++){
			if(vet[i] == " "){
				return false;
			}
		}
		return true;
	}
}