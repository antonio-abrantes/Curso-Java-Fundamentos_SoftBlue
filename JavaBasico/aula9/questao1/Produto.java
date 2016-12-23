package br.com.aula9.questao1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Produto {
	
	private static final DateFormat df = DateFormat.getInstance();
	private String produto;
	private double peso;
	private Date dataValidade;
	
	public Produto(String produto, double peso, int dia, int mes, int ano) {
		this.produto = produto;
		this.peso = peso;
		
		Calendar c = Calendar.getInstance();
		c.set(ano, mes - 1, dia);
		this.dataValidade = c.getTime();
	}

	public String getProduto() {
		return produto;
	}

	public double getPeso() {
		return peso;
	}

	public Date getData() {
		return dataValidade;
	}
	
	public String getFormateDatavalidade(){
		return df.format(dataValidade);
	}

}
