
public class Questao4 {

	public static void main(String[] args) {

		int i, anterior1 = 1, anterior2 = 1, fib = 1;
		
		for(i = 0; i < 15; i++){
			if(i < 2){
				System.out.print(i+" ");
			}else{
				System.out.print(fib+" ");
				fib = anterior1 + anterior2;				
				anterior1 = anterior2;
				anterior2 = fib;
			}			
		}
	}
}
