package br.com.aula10a;

public class App1 {
	
	private enum Sexo{
		MASCULINO, FEMININO;
	}

	public static void main(String[] args) {

		DiaDaSemana hoje = DiaDaSemana.DOMINGO;
		hoje = DiaDaSemana.SEXTA;
		
		System.out.println(hoje.DOMINGO);
		
		System.out.println(Sexo.FEMININO.toString());

	}

}
