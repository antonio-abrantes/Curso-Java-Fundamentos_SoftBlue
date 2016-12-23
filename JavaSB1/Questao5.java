
public class Questao5 {

	public static void main(String[] args) {

		int x = 11;
		
		if(x % 2 == 0){
			while(true){
				if(x > 1000)
					break;
				x = x + 5;
				System.out.print(x+" ");
				x = x + x;
				System.out.print(x+" ");				
			}
		}else{
			while(true){
				if(x > 1000)
					break;
				x = x * 2;
				System.out.print(x+" ");
				//x = x * x;
				//System.out.print(x+" ");				
			}
		}		
	}
}
