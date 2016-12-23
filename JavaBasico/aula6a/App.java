package br.com.aula6a;

public class App {

	public static void main(String[] args) {
		Carro v = new Carro();
		v.setQuatroPortas(true);
		v.setAno(2000);
		v.setMarca("FIAT");
		v.setModelo("Uno");	
		v.buzinar();
		v.imprmirDados();
		
		Motocicleta m = new Motocicleta();
		m.setMarca("QQQ");
		m.setModelo("ZZZ");
		m.setAno(2015);
		m.imprmirDados();
		
		m.buzinar();
		m.empinar();
		
		Caminhao cam = new Caminhao();
		cam.buzinar();
	}

}
