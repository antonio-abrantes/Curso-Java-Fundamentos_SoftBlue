package br.com.aula13c;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fr = new FileInputStream("entrada.txt");
        FileOutputStream wr = new FileOutputStream("saída.txt");
        int i = 0;
        while ((i = fr.read()) != -1) {
            wr.write(i);
        }
        wr.close();
        fr.close();
		
//		String inputFile = "entrada.txt";
//		String outputFile = "saida.pdf";
//		
//		try(InputStream in = new FileInputStream(inputFile);
//				OutputStream out = new FileOutputStream(outputFile)){
//			
//			byte[] buffer = new byte[1024];
//			
//			int bytesLidos;
//			String s;
//			while((bytesLidos = in.read(buffer)) > -1){
//				out.write(buffer, 0, bytesLidos); 
//			}			
//		}
	}	
}
