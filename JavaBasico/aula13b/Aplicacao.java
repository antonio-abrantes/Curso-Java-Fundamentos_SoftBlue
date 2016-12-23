package br.com.aula13b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Aplicacao {
	
	public static void main(String[] args) throws IOException{
		
		
		InputStream in = new FileInputStream("saida.bin");
		
		String s = "Logica de Programação";
		
		DataOutputStream filtro = null;
		
		try(FileOutputStream arquivo = new FileOutputStream("saida.bin")){
			
			filtro = new DataOutputStream(arquivo);
			filtro.writeUTF(s);
		}
		
		
		DataInputStream saida = null;
		try (FileInputStream arquivo = new FileInputStream( "livros.bin" )){
			String con = "";
			int tamanho;
			while((tamanho = arquivo.read()) != -1){
				char caracter = (char) tamanho;
				
				con += caracter;				 
			}
			
			System.out.println(con);
			
			//saida = new DataInputStream(arquivo);
			//System.out.println(saida.readUTF());

		}

		
//		try(BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt"))){
//			writer.write(s);
//		}
		
//		try(PrintWriter writer = new PrintWriter(new FileWriter("saida.txt", true))){
//			writer.println(s);
//		}
		
	}
}
