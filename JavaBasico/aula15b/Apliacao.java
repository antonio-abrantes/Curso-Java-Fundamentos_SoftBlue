package br.com.aula15b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Apliacao {

	public static void main(String[] args) throws Exception{

		int mat[][] = new int[4][4];
		Scanner in = new Scanner(new File("dados.txt"));
		
		Pattern p = Pattern.compile("a-b-c-d");
		
		int j = 0;
		while(in.hasNextLine()){
			String line = in.nextLine();
			Matcher m = p.matcher(line);
			int i = 0;
			while(m.find()){
				mat[j][i] = Integer.parseInt(m.group());
				i++;
			}			
			j++;

		}
		
		for(int i = 0; i < mat.length; i++){
			for(j = 0; j < mat[i].length; j++){
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
		

	}

}
