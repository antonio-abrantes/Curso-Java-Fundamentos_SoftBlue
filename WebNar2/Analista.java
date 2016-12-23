
public class Analista extends Funcionario{
	public Analista(String nome, int idade) {
		super(nome, idade);
	}
	
	public Analista(String nome) {
		super(nome);
	}
	
	private String setor;
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}	
	
	@Override
	public void mostrarDados() {
		if(calcularSalario() == 0){			
			super.mostrarDados();

		}else{
			super.mostrarDados();
			System.out.println("Setor: "+this.getSetor());
		}	
	}
}
