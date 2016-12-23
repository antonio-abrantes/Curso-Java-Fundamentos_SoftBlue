package br.com.aula14d;

import org.omg.PortableInterceptor.ForwardRequestHelper;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Buffer buffer = new Buffer();
		
		Produtor[] produtores = new Produtor[3];
		Consumidor[] consumidores = new Consumidor[10];
		
		for (int i = 0; i < produtores.length; i++) {
			produtores[i] = new Produtor(buffer);
			produtores[i].start();
		}
		
		
		for (int i = 0; i < consumidores.length; i++) {
			consumidores[i] = new Consumidor(buffer);
			consumidores[i].start();
		}
		
	}
	
}
