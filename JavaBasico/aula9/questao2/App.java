package br.com.aula9.questao2;

public class App {
	
	public static String processar(String s){
		StringBuilder temp = new StringBuilder();
		
		if(s.equals(null)){
			return null;
		}else{
			s = s.toUpperCase();
			if(s.length() <= 3){
				return s;
			}else{
				String t =  s.substring(0, 3);
				
//				temp.append(t);				
//				temp.reverse();
//				temp.append(s.substring(3, s.length()).trim());

				StringBuffer sb = new StringBuffer(t);
				sb.reverse();

				return sb.toString()+s.substring(3);
				//return temp.toString();
			}
		}		
	} 

	public static void main(String[] args) {
		
		System.out.println(App.processar("Antonio"));
		System.out.println(App.processar("Ana"));
		
		try {
			System.out.println(App.processar(null));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println(App.processar("ab"));
		System.out.println(App.processar("abcdefg"));

	}

}
