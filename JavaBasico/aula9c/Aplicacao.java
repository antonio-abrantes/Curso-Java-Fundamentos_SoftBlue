package br.com.aula9c;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {

		double d = 1145.4;
		
		NumberFormat nf1 = NumberFormat.getNumberInstance();		
		System.out.println(nf1.format(d).toString());
		
		
		NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("en", "US"));		
		System.out.println(nf2.format(d).toString());
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();		
		System.out.println(nf3.format(d).toString());
		
		DecimalFormat df1 = new DecimalFormat("00000.000");
		System.out.println(df1.format(d).toString());
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('-');
		df1.setDecimalFormatSymbols(dfs);
		System.out.println(df1.format(d));

	}

}
