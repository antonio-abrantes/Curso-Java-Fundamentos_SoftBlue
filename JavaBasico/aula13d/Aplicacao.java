package br.com.aula13d;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException{

		FileInputStream fin = new FileInputStream("entrada.txt");
		//InputStream cin = System.in;
		//FileOutputStream fout = new FileOutputStream("saida.txt");
		//OutputStream cout = System.out;
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		
		try{
			transfer(fin, bout);
		}finally{
			byte[] bytes = bout.toByteArray();
			String s = new String(bytes);
			System.out.println(s);
			
			fin.close();
			bout.close();
		}

		
	}
	
	private static void transfer(InputStream in, OutputStream out) throws IOException{
		
		byte[] buffer = new byte[1024];
		
		int bytesLidos;
		
		while((bytesLidos = in.read(buffer)) > -1){
			out.write(buffer, 0, bytesLidos);
		}
		
	}

}
