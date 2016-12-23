package br.com.aula6a;

public class Veiculo {
	
	private String marca;
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	private String modelo;
	private int ano;
	
	public void buzinar(){
		System.out.println("BI BI");
	}

	public void imprmirDados(){
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Ano: "+ano);
	}
}
