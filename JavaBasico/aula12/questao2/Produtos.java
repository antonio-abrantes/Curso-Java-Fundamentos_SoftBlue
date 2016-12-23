package br.com.aula12.questao2;

import java.util.Collection;

public class Produtos {
	
	Collection<Produto> produtos;
	
	public Produtos(Collection<Produto> produtos){
		this.produtos = produtos;
	}
	
	public void adicionar(Produto produto){
		produtos.add(produto);
	}
	
	public void mudarColecao(Collection<Produto> produtos){
		Collection<Produto> temp = this.produtos;
		this.produtos = produtos;
		
		this.produtos.addAll(temp);
	}
	
	public void imprimir(){
		for(Produto p : this.produtos){
			System.out.println(p.toString());
		}
		System.out.println("==============================");
	}

}
