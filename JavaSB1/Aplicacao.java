
public class Aplicacao {

	public static void main(String[] args) {

		int  $numero = 9;
		
		//float i = (float)2.5;
		
		//int numero = (int)i;
		
		//byte b = -122;
		
		//int numero = 10;
		/*String nome;
		
		nome = "Jose";
		
		switch(nome){
		case "Antonio":
			System.out.println(nome);
			break;
		case "Ana":
			System.out.println(nome);
			break;
		default:
			System.out.println("Padão");
			break;
		}*/
		
		String nome = "Antonio";
		
		System.out.println(nome);
		
		int meses = 3;
		double taxa = 2.0;
		//Calcular potencia
		double potencia = 1.0;
		for(int i = 0; i < meses; i++){
			potencia = potencia * taxa;
		}
		System.out.println(potencia);
		
		//int x = 0; 		
		//if(x){
		//   System.out.println(x);
		//}

	}

}
