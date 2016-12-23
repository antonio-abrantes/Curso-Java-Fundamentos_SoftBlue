package jogodavelha.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {
	
	public static String readString(){
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao ler o dado do teclado");
		}
	}
	
	public static int ReadeInt(){
		String str = readString();
		
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			throw new RuntimeException(str + " nao e um int valido");
		}
	}
	
	public static double ReadeDouble(){
		String str = readString();
		
		try {
			return Double.parseDouble(str);
		} catch (Exception e) {
			throw new RuntimeException(str + " nao e um int valido");
		}
	}
}
