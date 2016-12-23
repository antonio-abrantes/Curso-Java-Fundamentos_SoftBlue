
public class Questao6 {
	
	public static void verifica(int dia, int mes, int m, int ano){

		if(dia > mes){
			System.out.println("Data invalida");
		}else{
			System.out.println(dia+"/"+m+"/"+ano);
		}
	}
	
	public static void main(String[] args) {

		int janeiro = 31, fevereiro = 28, marco = 31, abril = 30, maio = 31, junho = 30,
			julho = 31, agosto = 31, setembro = 30, outubro = 31, novembro = 30, dezembro = 31;
			
		int dia, mes, ano;
		
		dia = 29;
		mes = 13;
		ano = 2016;
		
		if(ano > 2016){
			System.out.println("Data invalida");
		}else{
			
			switch(mes){
			case 1:
				if(dia > janeiro){
					System.out.println("Data invalida");
				}else{
					System.out.println(dia+"/"+mes+"/"+ano);
				}
				break;
			case 2:
				if(dia > fevereiro){
					System.out.println("Data invalida");
				}else{
					System.out.println(dia+"/"+mes+"/"+ano);
				}
				break;
			case 3:
				if(dia > marco){
					System.out.println("Data invalida");
				}else{
					System.out.println(dia+"/"+mes+"/"+ano);
				}
				break;
			case 4:
				if(dia > abril){
					System.out.println("Data invalida");
				}else{
					System.out.println(dia+"/"+mes+"/"+ano);
				}
				break;
			case 5:
				verifica(dia, maio, mes, ano);
				break;
			case 6:
				verifica(dia, junho, mes, ano);
				break;
			case 7:
				verifica(dia, julho, mes, ano);
				break;
			case 8:
				verifica(dia, agosto, mes, ano);
				break;
			case 9:
				verifica(dia, setembro, mes, ano);
				break;
			case 10:
				verifica(dia, outubro, mes, ano);
				break;
			case 11:
				verifica(dia, novembro, mes, ano);
				break;
			case 12:
				verifica(dia, dezembro, mes, ano);
				break;	
			default:
				System.out.println("Mes não existe!");
				break;				
			}//fim switch
			
				
		}//Fim else			
	}
}
