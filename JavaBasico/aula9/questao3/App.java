package br.com.aula9.questao3;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class App {

	public static void main(String[] args) {

		LocalDate birthday = LocalDate.parse("1955-05-19");
		LocalDate today = LocalDate.now();
		
		Period periodo = Period.between(birthday, today);
		
		//DateFormat.getDa
		
		System.out.printf("%d", 123);
				
		LocalDateTime d2 = LocalDateTime.now();
		System.out.println(String.format("%d anos, %d meses e %d dias", periodo.getYears(), periodo.getMonths(), periodo.getDays()));
		
		LocalTime horas = LocalTime.parse("03:00");
		LocalTime agora = LocalTime.now();
		
		Duration duracao = Duration.between(horas, agora);
		System.out.println(String.format("%d segundos", duracao.getSeconds()));
		System.out.println("Segundos passados até o momento: "+ChronoUnit.SECONDS.between(horas, agora));
		

		//Minhas implemetações
		String  dataBascimento = "19/05/1955 10:00";
		LocalDateTime d1 = LocalDateTime.parse(dataBascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());		
		System.out.println("Passaram se "+p.getYears()+", "+p.getMonths()+" meses e "+p.getDays()+" dias dês de o nascimento de James Gosling");		
		System.out.println("Passaram "+ChronoUnit.YEARS.between(d1, d2)+", "+p.toTotalMonths()%12+" meses e "+ChronoUnit.DAYS.between(d1, d2)% 365%12);
				
		//Minhas implemetações
		String horaHoje = "24/09/2016 03:00";	
		LocalDateTime t1 = LocalDateTime.parse(horaHoje, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime t2 = LocalDateTime.now();
		Duration d = Duration.between(t1, t2);
		
		System.out.println("Segundos passados até o momento: "+ChronoUnit.SECONDS.between(t1, t2));
		System.out.println("Segundos passados até o momento: "+d.toMinutes()*60);
		
		Duration d5 = Duration.of(45, ChronoUnit.MINUTES);
		
		LocalDateTime ldt1 = LocalDateTime.of(2020, Month.MAY, 5, 16, 0);
		
		LocalDateTime ldt2 = ldt1.plus(d5); 
		
		String s = ldt2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		System.out.println(s);
		
		String s1 = "abc";
		String s2 = new String("abc");

		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		
		
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
	
	}

}
