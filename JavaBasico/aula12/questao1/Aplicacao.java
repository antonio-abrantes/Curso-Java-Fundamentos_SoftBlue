package br.com.aula12.questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aplicacao {
	
	private static void imprimir(List vet){
		for(int i = 0; i < 9; i= i +3){
			System.out.println("  "+vet.get(i)+" | "+vet.get(i+1)+" | "+vet.get(i+2));
			if(i < 6){
				System.out.println("--------------");
			}
		}		
	}
	
	
	private static boolean jogada_jogador(int x, int y, List vet){
		y--;
		if(x == 1){
			x = y;
		}
		else if(x == 2){
			x = x + 1 + y;
		}
		else if(x == 3){
			x = x + 2 + y+1;
		}
		
		if(vet.get(x).equals(" ")){
			vet.set(x, "X");
		}else{
			System.out.println("Jogada invalida, tente novamente...");
			return false;
		}
		return true;
	}
	
	private static void jogada_pc(List vet){
		
		while(true){			
			Random r = new Random();
			
			int i = r.nextInt(9);

			if(vet.get(i).equals(" ")){
				vet.set(i, "O");
				break;
			}
		}	
	}

	public static void main(String[] args) {
		
		List<String> vet = new ArrayList<String>();
		vet.add(" ");
		vet.add(" ");
		vet.add(" ");
		vet.add(" ");
		vet.add(" ");
		vet.add(" ");
		vet.add(" ");
		vet.add(" ");
		vet.add(" ");
		
		jogada_jogador(1, 1, vet);
		//jogada_pc(vet);
		jogada_jogador(2, 2, vet);
		//jogada_pc(vet);
		jogada_jogador(3, 3, vet);
		//jogada_pc(vet);
		
		imprimir(vet);
	
	}
}
