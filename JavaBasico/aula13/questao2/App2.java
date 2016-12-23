package br.com.aula13.questao2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) throws IOException{

		FileInputStream fr = new FileInputStream("entrada.txt");
        FileOutputStream wr = new FileOutputStream("saída.txt");
        int i = 0;
        while ((i = fr.read()) != -1) {
            wr.write(i);
        }
        wr.close();
        fr.close();

	}

}
