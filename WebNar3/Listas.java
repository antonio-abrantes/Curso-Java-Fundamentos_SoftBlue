import java.util.ArrayList;
import java.util.List;

public class Listas {
	
	public static void main(String[] args){
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Java");
		lista.add("C++");
		lista.add("PHP");
		
		//System.out.println(lista.get(0));
		
		//Object obj = lista.get(1);
		//String s = (String)obj;
		
		for(String s : lista){
			System.out.println(s);
		}
	}
}
