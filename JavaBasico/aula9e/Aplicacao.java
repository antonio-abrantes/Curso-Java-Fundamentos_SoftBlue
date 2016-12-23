package br.com.aula9e;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aplicacao {

	public static void main(String[] args) {
		
		String  dataBascimento = "17/05/1982 22:00";
		
		LocalDateTime d1 = LocalDateTime.parse(dataBascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDateTime d2 = LocalDateTime.now();
		
		Duration d = Duration.between(d1, d2);
		
		System.out.println("Horas: "+d.toHours());
		System.out.println("Dias: "+d.toDays());
		System.out.println("Anos: "+d.toDays()/365);

		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
		
		System.out.println("Meses: "+p.toTotalMonths()/12);
		
		System.out.println("Semanas: "+ChronoUnit.WEEKS.between(d1, d2));
		System.out.println("Anos: "+ChronoUnit.YEARS.between(d1, d2));
		System.out.println("Dias: "+ChronoUnit.DAYS.between(d1, d2) / 365);

	}

}
