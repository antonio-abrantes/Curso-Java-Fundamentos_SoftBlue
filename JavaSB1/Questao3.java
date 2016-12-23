
public class Questao3 {
	
	public static int fatorial(int fat){
		
		int result;
		if(fat == 0){
			result = 1;
		}else{
			result = fat * fatorial(fat - 1);
		}
		
		return result;
	}

	public static void main(String[] args) {

		//n! = n (n -1)! x n
		
		int fatorial = 5, result = 1;
		
		for( ; fatorial >= 1; fatorial--){
			result = result * fatorial;
		}
		
		System.out.println(result);
		
		System.out.println(fatorial(0));

	}

}
