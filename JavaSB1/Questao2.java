
public class Questao2 {

	public static void main(String[] args) {

		int i, soma;
		
		for(i = 10; i <= 25; i++){
			System.out.print(i+" ");
		}
		System.out.print("\n");
		
		soma = 0;
		for(i = 1; i <= 100; i = i + 2){
			//System.out.println(i+" ");
			soma = soma + i;
		}
		System.out.println("SOMA = "+soma);
		
		soma = 0;
		i = 0;
		while(true){
			//System.out.println(i+" ");
			soma = soma + i;
			if(soma > 100)
				break;
			i++;			
			System.out.print(soma+" ");
		}
		System.out.print("\n");
		
		for(i = 1; i <= 10; i++){
			System.out.println(i+" x 9 = "+i*9);
		}
			
	}

}
