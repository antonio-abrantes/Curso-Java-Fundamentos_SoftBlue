package br.com.aula12a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		
        String texto = "nome;teste;10";
		
		List<String> list = new ArrayList<>();
		
		list = Arrays.asList(texto.split(";"));
		
		for(String p : list){
			System.out.println(p);
		}

		int[] array = new int[5];
		array[0] = 2;

	}

}
