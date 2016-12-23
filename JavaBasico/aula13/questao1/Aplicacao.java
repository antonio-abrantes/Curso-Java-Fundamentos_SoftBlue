package br.com.aula13.questao1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		Scanner inConsole = new Scanner(System.in);
		Scanner inFile;
		String listaAnterior = "";

		try {
			inFile = new Scanner(new File("lista.txt"));
			if (inFile != null) {

				while ((inFile.hasNextLine())) {				
					listaAnterior += inFile.nextLine() + "\n";
				}
				System.out.println("Itens ja cadastrados:");
				System.out.println(listaAnterior);
			}
		} finally {
			
		}

		String lista = "";
		String itens;
		while ((itens = inConsole.nextLine()) != null) {
			if (itens.equals("0") == true)
				break;
			if (itens.equals("") == true)
				continue;
			// System.out.println(item);
			lista += itens + "\r\n";
		}

		// System.out.println(lista);

		try (PrintWriter writer = new PrintWriter("lista.txt")) {
			writer.print(listaAnterior + lista);
		}

	}

}
