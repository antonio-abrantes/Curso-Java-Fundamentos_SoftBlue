package br.com.aula8e;

public class Aplicacao {

	public static void main(String[] args) {

		ContadoPF c1 = new ContadoPF();
		c1.setNome("Antonio Abrantes");
		c1.setCpf("2555445454");

		//// Endereco e1 = new Endereco();
		//// e1.setCidade("Sousa");
		//// e1.setEstado("PB");
		//
		// c1.setEndereco(e1);

		c1.getEndereco().setCidade("Sousa");
		c1.getEndereco().setEstado("PB");

		Agenda a1 = new Agenda();
		a1.setContato1(c1);

		System.out.println("Contato definido...");
		
		imprimirNomes(a1);
		imprimirCnpj(a1);

	}

	private static void imprimirNomes(Agenda a) {
		System.out.println(a.getContato1().getNome());
		if(a.getContato2() != null){
			System.out.println(a.getContato2().getNome());
		}		
	}
	
	private static void imprimirCnpj(Agenda a) {
		if(a.getContato1() != null && a.getContato1() instanceof ContadoPJ){
			ContadoPJ c = (ContadoPJ)a.getContato1();
			System.out.println(c.getCnpj());
		}		
	}

}
