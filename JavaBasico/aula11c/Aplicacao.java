package br.com.aula11c;

public class Aplicacao {
	
	public static void ordenar(int[] vet){
	    int i , j , temp, size = vet.length;
	    
	    int incremento = 1;
	    while(incremento < size) {
	        incremento = 3 * incremento + 1;
	    }
	     
	    while (incremento > 1) {
	        incremento /= 3;
	        
	        for(i = incremento; i < size; i++) {
	            temp = vet[i];
	            j = i - incremento;
	            while (j >= 0 && temp < vet[j]) {
	                vet[j + incremento] = vet[j];
	                j -= incremento;
	            }
	            vet [j + incremento] = temp;
	        }
	    }
	}
	
	public static void main(String[] args) {
		
		int[] vet = {1, 27, 6, 2, 7, 9, 5, 8, 4, 3, 15};
		
		Aplicacao.ordenar(vet);
		
		for(int i : vet){
			System.out.print(" "+i);
		}

//		String s1 = "abc";
//		String s2 = new String("abc");
//
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));

	}

}
