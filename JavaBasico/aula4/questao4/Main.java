package br.com.aula4.questao4;

public class Main {

	public static void main(String[] args) {
	
		Turma t1 = new Turma();
		
		//Chamada com o construtor personalizado
		Aluno aluno1 = new Aluno(4.0, 2.5, 1.0, 7.1);
		Aluno aluno2 = new Aluno(6.5, 3.5, 0.0, 3.1);
		Aluno aluno3 = new Aluno(5.0, 4.0, 6.0, 1.5);
		
		//Construtor padrao
		//Aluno aluno1 = new Aluno();
		//Aluno aluno2 = new Aluno();
		//Aluno aluno3 = new Aluno();
		
		t1.aluno1 = aluno1;
		t1.aluno2 = aluno2;
		t1.aluno3 = aluno3;
		
		//Aluno 1
		/*Prova a1p1 = new Prova();
		a1p1.nota1 = 4.0;
		a1p1.nota2 = 2.5;
		aluno1.prova1 = a1p1;
		
		Prova a1p2 = new Prova();
		a1p2.nota1 = 1.0;
		a1p2.nota2 = 7.1;
		aluno1.prova2 = a1p2;	
		
		//Aluno 2
		Prova a2p1 = new Prova();
		a2p1.nota1 = 6.5;
		a2p1.nota2 = 3.5;
		aluno2.prova1 = a2p1;
		
		Prova a2p2 = new Prova();
		a2p2.nota1 = 0.0;
		a2p2.nota2 = 3.1;
		aluno2.prova2 = a2p2;
		
		//Aluno 3
		Prova a3p1 = new Prova();
		a3p1.nota1 = 5.0;
		a3p1.nota2 = 4.0;
		aluno3.prova1 = a3p1;
				
		Prova a3p2 = new Prova();
		a3p2.nota1 = 6.0;
		a3p2.nota2 = 1.5;
		aluno3.prova2 = a3p2;*/
		
		System.out.println("Media aluno 1: "+t1.aluno1.calcularMedia());
		System.out.println("Media aluno 2: "+t1.aluno2.calcularMedia());
		System.out.println("Media aluno 1: "+t1.aluno3.calcularMedia());

		System.out.println("Media da turma: "+t1.calcularMedia());
	}

}
