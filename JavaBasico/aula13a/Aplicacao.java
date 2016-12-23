package br.com.aula13a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException{

//		try(InputStream is = new FileInputStream("entrada.txt")){
//			byte[] buffer = new byte[1024]; 
//			
////          byte[] buffer2 = new byte[is.read(buffer)];			
////			for(int i = 0; i < buffer2.length; i++){
////				buffer2[i] = buffer[i];
////			}
////			String s = new String(buffer2);
//			
//			int charLidos = is.read(buffer);
//			String s = new String(buffer, 0, charLidos);
//			
//			System.out.println(s);
//		}	
		
//		try(InputStream is = new FileInputStream("entrada.txt")){
//			byte[] buffer = new byte[4]; 
//				
//			int charLidos;
//			String s = null;
//			while((charLidos = is.read(buffer)) > -1){
//				s += new String(buffer, 0, charLidos);;
//			}
//
//			System.out.println(s);
//		}
//		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){
//			
//			String line;			
//			while((line = reader.readLine()) != null){
//				System.out.println(line);
//			}	
//		}
		try(Scanner scanner = new Scanner(new File("entrada.txt"))){
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				System.out.println(line);
			}
		}
		
//		int[][] mat = new int[10][10];
//		
//		for(int i = 0; i < mat.length; i++){
//			for(int j = 0; j < mat[i].length; j++){
//				System.out.print(" "+mat[i][j]);
//			}
//			System.out.println();
//		}
		
	}
}



















