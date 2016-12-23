package br.com.aula9d;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class App2 {

	public static void main(String[] args) {


		String data1 = "13/07/1981 00:00";
		//LocalDate d1 = LocalDate.parse(data1);
		LocalDateTime ldt1 = LocalDateTime.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		String data2 = "1981-07-13";
		LocalDate ld1 = LocalDate.parse("1981-07-13");
		
		SimpleDateFormat spd3 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(spd3);
		
		System.out.println(ld1);
		
		String dataTeste = "12/10/1981";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dt = sdf1.parse(dataTeste);
			System.out.println(sdf1.format(dt));
		} catch (ParseException e) {
			System.out.println("Data invalida: "+e.getMessage());
		}

	}

}
