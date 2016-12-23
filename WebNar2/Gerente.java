public class Gerente extends Funcionario{
	public Gerente(String nome, int idade) {
		super(nome, idade);
	}
	
	public Gerente(String nome) {
		super(nome);
	}
	
	private double bonus;
		
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double calcularSalario() {
		double montante = super.calcularSalario();
		if(montante != 0){
			montante = montante + this.bonus;
			return montante;
		}else{
			return 0;
		}
	}

	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Bonus: R$ "+this.getBonus());
	}	
}