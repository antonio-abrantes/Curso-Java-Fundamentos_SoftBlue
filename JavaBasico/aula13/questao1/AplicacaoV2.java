package br.com.aula13.questao1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacaoV2 {
	
	private static final String  LIST_FILE = "lista.txt";

	public static void main(String[] args) throws IOException{
		
		List<String> lista = readFile();
		if(lista != null && lista.size() > 0){
			System.out.println("Itens ja cadastrados");
			for(String s : lista){
				System.out.println(s);
			}
		}
		
		Scanner keybord = new Scanner(System.in);
		
		PrintWriter writer = null;
		
		try{
			writer = new PrintWriter(new FileWriter(LIST_FILE, true));
			
			while(true){
				System.out.print("Insira um novo item: ");
				String item = keybord.nextLine();
				if(item.trim().length() == 0){
					continue;
				}
				
				if(item.equals("0")){
					System.out.println("Fim da execucao!");
					break;
				}
				writer.println(item);
			}		
		}finally{
			if (writer != null) {
				writer.close();
			}
			
			// Fecha o Scanner
			keybord.close();
		}
	
	}
	
//	
//	private static List<String> readFile() throws IOException{
//		
//		File file = new File(LIST_FILE);
//		
//		if(!file.exists()){
//			return null;
//		}
//		
//		List<String> lista = new ArrayList<String>();
//		
//		BufferedReader reader = null;
//		
//		try{
//			reader = new BufferedReader(new FileReader(LIST_FILE));
//			
//			String line;
//			
//			while((line = reader.readLine()) != null){
//				lista.add(line);
//			}
//			
//			return lista;
//			
//		}finally{
//			if(reader != null){
//				reader.close();
//			}
//		}
//	}
	
	private static List<String> readFile() throws IOException{
		
		File file = new File("");
		
		if(!file.exists()){
			return null;
		}
		
		List<String> lista = new ArrayList<String>();
		
		Scanner in = new Scanner(new File(LIST_FILE));
		
		String line;
		
		while(in.hasNextLine()){
			line = in.nextLine();
			lista.add(line.trim());
		}
		
		return lista;
	}

}
