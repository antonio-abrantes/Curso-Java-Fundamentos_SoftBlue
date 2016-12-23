
public class App {

	public static void main(String[] args) {

		int[] conjunto = new int[100];
		int[] temp = new int[100];
		int[][] matriz = new int[100][100];
		int i, j, g, z, cont = 0, tamanho, razao, tMat = 0, maior = 0, maiorMat = 0;
		
		tamanho = Console.readInt();
		
		for(i = 0; i < tamanho; i++){
			conjunto[i] = Console.readInt();
		}
				
		for(i = 1; i < tamanho-1; i++){
			g = 0;
			razao = conjunto[i] - conjunto[i-1];
			cont = 0;
			if(conjunto[i] + razao == conjunto[i +1]){
				for(j = i; j <= tamanho; j++ ){
					if(j == i){
						temp[g] = conjunto[i-1];
						cont++;
						g++;
					}
					if(conjunto[j] - conjunto[j-1] == razao){
						cont++;
						temp[g] = conjunto[j];
						g++;
					}else{
						i = i + cont-1;
						break;
					}
				}
			}			
			if(cont >= 3){ 
				if(cont >= maior){ //Verifica qual a maior PA
					maior = cont;  //Guarda a quantidade de valores da maior PA
					maiorMat = tMat; //Guarda a linhada matriz onde ficara a maior PA
				}
				
				for(z = 0; z < cont; z++){					
					matriz[tMat][z] = temp[z]; //Jogar a PA encontrada na matriz...
				}
				tMat++;
			}			
		}
			for(j = 0; j < maior; j++){ // Imprime apenas a maior PA encontrada...
				System.out.print(matriz[maiorMat][j]+" ");
			}
			System.out.println();
	}
}
