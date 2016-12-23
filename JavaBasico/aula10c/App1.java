package br.com.aula10c;

import java.io.IOException;

public class App1 {
	
	public static void main(String[] args) {

		try {
	        String comando = "cmd.exe /c start C:\\Downloads\\Busca_musica1.exe";
	        
	        Runtime.getRuntime().exec(comando);
	    } catch (IOException e) {
	    }

	}

}
