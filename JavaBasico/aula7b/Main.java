package br.com.aula7b;

public class Main {

	public static void main(String[] args) {

		Automovel f = new Ferrari();
		
		Rota rota = new Rota();
		rota.ir(f);
		
		AnelBrilhante a = new AnelBrilhante();
		
		Vendedor v = new Vendedor();
		v.MostrarPreco(f);
		v.MostrarPreco(a);

	}

}
