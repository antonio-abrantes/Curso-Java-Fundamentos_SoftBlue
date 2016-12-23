package br.com.aula4.questao4;

public class Aluno {
	
	Prova prova1 = new Prova();
	Prova prova2 = new Prova();
	
	//Manter construtor padrão
	public Aluno(){}

	public Aluno(double p1n1, double p1n2, double p2n1, double p2n2){
		prova1.nota1 = p1n1;
		prova1.nota2 = p1n2;
		prova2.nota1 = p2n1;
		prova2.nota2 = p2n2;
	}
	
	double calcularMedia(){
		double media = prova1.calcularNotaTotal() + prova2.calcularNotaTotal();
		return  media / 2.0;
	}

}
