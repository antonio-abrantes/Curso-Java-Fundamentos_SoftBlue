
public class Arrays {
	
	/*private static double calcularMedia(double[] media){
		double soma = 0;
		for(int i = 0; i < media.length; i++){
			soma = soma + media[i];
		}
		System.out.println(media);
	}*/
	
	public static void main(String[] args){
		
		double[] notas = new double[5];
		
		//double[] notas2 = {2 , 3, 5};
		
		notas[0] = 3.5;
		notas[1] = 8.5;
		notas[2] = 8.0;
		notas[3] = 5.5;
		notas[4] = 6.0;
		
		for(int i = 0; i < notas.length; i++){
			System.out.println(notas[i]);
		}
	}

}
