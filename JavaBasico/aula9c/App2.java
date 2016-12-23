package br.com.aula9c;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App2 {

	public static void main(String[] args) {


		LocalDateTime d1 = LocalDateTime.parse("13/07/1982 11:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime d2 = LocalDateTime.now();
		
		Period tempo = Period.between(d1.toLocalDate(), d2.toLocalDate());
		
		System.out.println("Anos: "+ tempo.getYears());
		System.out.println("Dias de vida: "+ChronoUnit.DAYS.between(d1, d2));
		System.out.println("Semanas: "+ChronoUnit.WEEKS.between(d1, d2));
		
		String data = "13/07/1982 00:00";
		
		LocalDateTime teste = LocalDateTime.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime t2 = LocalDateTime.now();
		
		Period p = Period.between(teste.toLocalDate(), t2.toLocalDate());
		
		Duration d = Duration.between(teste, t2);
		
		System.out.println(p.getYears()+" - "+d.toHours());
		
		LocalDate date = LocalDate.now();
	    LocalTime time = LocalTime.now();
	    LocalDateTime dataHora = LocalDateTime.of(date, time);
		
	    System.out.println(dataHora);
	    
	    LocalDate dateFromDateTime = LocalDateTime.now().toLocalDate();
	    LocalTime timeFromDateTime = LocalDateTime.now().toLocalTime();
	    
	    System.out.println(dateFromDateTime);
	    
	    System.out.println(timeFromDateTime);
	    
	    LocalDate l1 = LocalDate.parse("1981-07-13");
	    LocalTime t1 = LocalTime.parse("19:30");
	    
	    LocalDateTime lt1 = LocalDateTime.of(l1, t1);
	    
	    System.out.println(lt1);

	}

}
