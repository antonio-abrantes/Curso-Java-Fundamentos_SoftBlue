package br.com.aula9d;

import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 1, 5, 13, 30, 0);
		
		cal.add(Calendar.YEAR, 2);
		Date data1 = cal.getTime();	
		
		System.out.println(data1);
		

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df1.format(data1));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df2.format(data1));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df3.format(data1));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "US"));
		System.out.println(df4.format(data1));
		
		SimpleDateFormat df5 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(df5.format(data1));
		
		String sd1 = "01072030";
		SimpleDateFormat df6 = new SimpleDateFormat("ddMMyyyy");
		
		Date d2;
		
		try {
			d2 = df6.parse(sd1);
			System.out.println(d2);
			DateFormat df7 = DateFormat.getDateInstance(DateFormat.MEDIUM);
			System.out.println(df7.format(d2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
