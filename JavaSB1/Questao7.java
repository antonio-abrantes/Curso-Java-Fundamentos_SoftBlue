
public class Questao7 {

	public static void main(String[] args) {
		
		int cont = 0;
		double soma = 0;
		
		while(true){
			double nota = Console.readDouble();
			
			if(nota == -1){
				if(soma > 0){
					soma = soma / (double)cont;
					System.out.println("Media: "+soma);
				}else{
					System.out.println("Sem nota para calcular");
				} break;
			}else if(nota < 0 && nota != -1){
				System.out.println("Nota invalida, digite novamente");
				continue;
			}else{
				soma = soma + nota;
				cont++;
			}						
		}
	}
}
