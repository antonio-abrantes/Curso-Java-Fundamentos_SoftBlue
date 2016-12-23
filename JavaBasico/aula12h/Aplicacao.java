package br.com.aula12h;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "Produto 1", 3.9);
		Produto p2 = new Produto(2, "Produto 2", 3.9);
		Produto p3 = new Produto(3, "Produto 1", 2.9);
		Produto p4 = new Produto(4, "Produto 4", 6.5);
		Produto p5 = new Produto(5, "Produto 5", 8.0);
		
		//Conjuntos
		//Set<Produto> produto = new TreeSet<>();	
		//Set<Produto> produto = new TreeSet<>(new DescricaoComparator());
		
		//Listas
		List<Produto> produto = new ArrayList<Produto>();	
		Collections.sort(produto, new DescricaoComparator());
		
		produto.add(p1);
		produto.add(p2);
		produto.add(p3);
		produto.add(p4);
		produto.add(p5);
		
		for(Produto p : produto){
			System.out.println("=> "+p);
		}
		
//		System.out.println("p1 => "+produto.contains(p1));
//		System.out.println("p2 => "+produto.contains(p2));
//		System.out.println("p3 => "+produto.contains(p3));
//		System.out.println("p4 => "+produto.contains(p4));
//		System.out.println("p5 => "+produto.contains(p5));
	}
}
