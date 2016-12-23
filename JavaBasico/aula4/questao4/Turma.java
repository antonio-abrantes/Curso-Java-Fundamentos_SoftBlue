package br.com.aula4.questao4;

public class Turma {

	Aluno aluno1;
	Aluno aluno2; 
	Aluno aluno3;
	
	public Turma(){}
	
	public Turma(double p1n1, double p1n2, double p2n1, double p2n2){
		aluno1 = new Aluno(p1n1, p1n2, p2n1, p2n2);
		aluno1 = new Aluno(p1n1, p1n2, p2n1, p2n2);
		aluno1 = new Aluno(p1n1, p1n2, p2n1, p2n2);
	}
	
	double calcularMedia(){
		double media = aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia();
		return media / 3.0;
	}
	
}
