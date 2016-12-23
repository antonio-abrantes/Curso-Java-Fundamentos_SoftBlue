import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class App3 {

	public static void main(String[] args) {
		String texto = "nome;teste;10";
		
		List<String> list = new ArrayList<>();
		
		list = Arrays.asList(texto.split(";"));
		
		for(String p : list){
			System.out.println(p);
		}
	}

}
