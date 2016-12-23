package br.com.aula4.questao1;

public class Main1 {

	public static void main(String[] args) {
		
		Relogio r1 = new Relogio();
		
		r1.acertarHora(3, 30, 50);
		
		System.out.println("São: "+r1.lerHora()+":"+r1.lerMinuto()+":"+r1.lerSegundo());
		
		Relogio r2 = new Relogio();
		
		r2.acertarHora(22, 0, 0);
		
		System.out.println("Hora: "+r2.lerHora());
	}

}
