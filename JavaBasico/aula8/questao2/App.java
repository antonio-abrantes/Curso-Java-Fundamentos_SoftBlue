package br.com.aula8.questao2;

public class App {

	public static void main(String[] args) throws Exception {

		Object o = null; //new Object();

		try {
			o.toString();
			//System.out.println(o.toString());;
		} catch (Exception e) {
			System.out.println("O objeto acessado é nulo...");
		} finally {
			System.out.println("Encerrando o sistema adequadamente...");
		}
	}
}
