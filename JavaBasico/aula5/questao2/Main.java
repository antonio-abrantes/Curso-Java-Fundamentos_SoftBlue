package br.com.aula5.questao2;

public class Main {

	public static void main(String[] args) {

		Data d1 = new Data(10, 3, 2000, 10, 30, 10);
		System.out.println(d1.imprimir1(Data.HORA_24));
		System.out.println(d1.imprimir1(Data.HORA_12));
		
		Data d2 = new Data(15, 6, 2000, 23, 15, 20);
		System.out.println(d2.imprimir1(Data.HORA_12));
		System.out.println(d2.imprimir1(Data.HORA_24));
		
		Data d3 = new Data(5, 10, 2005);
		System.out.println(d3.imprimir1(Data.HORA_12));
		System.out.println(d3.imprimir1(Data.HORA_24));	
		
		Data d4 = new Data(15, 6, 2000, 23, 15, 20);
		System.out.println(d4.imprimir1(Data.HORA_12));
		System.out.println(d4.imprimir1(Data.HORA_24));
		d4.imprimir2(Data.HORA_12);
		d4.imprimir2(Data.HORA_24);
	}
}
