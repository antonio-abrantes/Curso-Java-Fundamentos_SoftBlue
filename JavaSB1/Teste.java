import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	private static final String ARQUIVO = "lista.txt";
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(ler());
		System.out.println("Adicione mais um elementos ou digite 0 para sair ");
		gravarDados();
		
	}

	private static void gravarDados(){
		Scanner in = new Scanner(System.in);
		
		PrintWriter file = null;

		try {
			 file = new PrintWriter(new FileWriter(ARQUIVO, true));

			 String s;
			 while(true){
				 s = in.nextLine();
				 if(s.equals("0")){
					 break;
				 }
				 file.println(s);
			 }
			 
		} catch (IOException e) {
			System.out.println("Erro ao gravar: "+e.getMessage());
		}finally{
			if(file != null){
				file.close();
			}
		}
	}
	
	private static List<String> ler() throws IOException{
		File file = new File(ARQUIVO);
		
		List<String> lista = new ArrayList<String>();
		
		if(!file.exists()){
			return null;
		}
		
		BufferedReader conteudo = null;
		
		try{
			conteudo = new BufferedReader(new FileReader(ARQUIVO));
			String linha;
			while((linha = conteudo.readLine()) != null){
				lista.add(linha);
			}
			
		}finally{
			conteudo.close();
		}
		
		return lista;
	}
}