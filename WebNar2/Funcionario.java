
public class Funcionario {
	private String nome;
	private int idade;
	private double salario = 0;
	private double horas = 0;
	
	public Funcionario(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public Funcionario(String nome){
		this.nome = nome;
		this.idade = 18;
	}
	
	public double calcularSalario(){
		double montante;
		
		if(this.horas <= 160 && this.horas != 0){
			if(this.salario >= 10 && this.salario <= 200){
				montante = this.salario * this.horas;
				return montante;
			}else{
				return 0;
			}
		}else{
			return 0;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario <= 0 || salario > 200){
			System.out.println("Valor de salario invalido!");
		}else{
			this.salario = salario;
		}	
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		if(horas <= 0 || horas > 160){
			System.out.println("Quantidade de horas invalidas!");
		}else{
			this.horas = horas;
		}
	}
	
	public void mostrarDados(){
		double resultado = calcularSalario();
		if(resultado == 0){			
			System.out.println("O Salario de "+this.nome+" não pode ser calculado");

		}else{
			System.out.println("Funcionario: "+this.getNome());
			System.out.println("Idade: "+this.getIdade());
			System.out.println("Salario: R$ "+resultado);
		}
	
	}
}
