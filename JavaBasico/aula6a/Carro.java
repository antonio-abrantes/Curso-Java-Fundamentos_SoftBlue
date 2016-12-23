package br.com.aula6a;

public class Carro extends Veiculo{
	
	private boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	@Override
	public void imprmirDados(){
		super.imprmirDados();
		System.out.println("Quatro portas: "+this.isQuatroPortas());
	}
}
