package br.com.aula12.questao2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {

		//Produtos produtos = new Produtos(new HashSet<>());
		Produtos produtos = new Produtos(new ArrayList<Produto>());
		
		produtos.adicionar(new Produto("Laranja", 2.50));
		produtos.adicionar(new Produto("Laranja", 2.70));
		produtos.adicionar(new Produto("Maçã", 1.45));
		
		produtos.imprimir();
		
		//produtos.mudarColecao(new TreeSet<Produto>());
		produtos.mudarColecao(new HashSet<Produto>());
		
		produtos.imprimir();
	}

}
