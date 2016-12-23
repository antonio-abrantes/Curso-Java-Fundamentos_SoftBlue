package br.com.aula13.questao2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
	
	private static final String FILE = "livros.bin";
	
	public static void main(String[] args) throws IOException{
		
		//InputStream
		
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Gravar dados");
		System.out.println("2 - Ler dados");
		System.out.print("=> ");
		
		Scanner keyboard = new Scanner(System.in);
		String opcao = keyboard.nextLine();
		keyboard.close();
		
		if(opcao.equals("1")){
			gravarDados();
		}else if(opcao.equals("2")){
			lerDados();
		}else{
			System.out.println("Opção desconhecida");
		}
	}
	
	private static void lerDados() throws IOException{
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		
		DataInputStream dis = null;
		try{
			dis = new DataInputStream(new FileInputStream(FILE));
			l1.read(dis);
			
			l2.read(dis);
			
		}finally{
			if(dis != null){
				dis.close();
			}
		}	
		System.out.println(l1);
		System.out.println(l2);		
	}
	
	
	public static void gravarDados() throws IOException{

		Autor a1 = new Autor("Maria Oliveira", "25/02/1980");
		Autor a2 = new Autor("Jose Silva", "01/04/1972");
		
		Livro l1 = new Livro("Orientaçao a Objetos", 350, a2);
		Livro l2 = new Livro("Programação Java", 200, a1);
		
		DataOutputStream dos = null;
		
		try{
			dos = new DataOutputStream(new FileOutputStream(FILE));
			l1.write(dos);
			l2.write(dos);
		}finally{
			if(dos != null){
				dos.close();
			}
		}
	}

//	public static void main(String[] args) throws IOException{
//		
//		List<Livro> livros = new ArrayList<Livro>();
//		livros.add(new Livro("O Zair", 189, "Paulo Coelho", "24/08/1947"));
//		livros.add(new Livro("O diario de um mago", 300, "Paulo Coelho", "24/08/1947"));
//		livros.add(new Livro("O Alquimista", 219, "Paulo Coelho", "24/08/1947"));
//		livros.add(new Livro("Veronica decide morrer", 150, "Paulo Coelho", "24/08/1947"));
//		livros.add(new Livro("Monte Cinco", 250, "Paulo Coelho", "24/08/1947"));
//		
//		PrintWriter gravar = null;
//		try {
//			gravar = new PrintWriter(new FileWriter("registro.txt", true));
//
//				for(Livro l1 : livros ){
//					System.out.println(l1.toString());
//					gravar.println(l1.toString());
//				}
//		} finally{
//			gravar.close();
//		}
//	}	
}