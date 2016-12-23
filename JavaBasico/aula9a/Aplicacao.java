package br.com.aula9a;

public class Aplicacao {

	public static void main(String[] args) {

		String s1 = new String("Antonio");
		
	    String[] s2 = {"Antonio", "Aninha", "Fulano"};
	    
	    for(int i = 0; i < s2.length; i++){
	    	System.out.println(s2[i]);
	    }
	    
	    String s3 = "Antonio";
		
		System.out.println(s1+" - "+s2[2]);
		
		//System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2[0]));
		
		System.out.println(s2.equals(s3));
		

	}

}
