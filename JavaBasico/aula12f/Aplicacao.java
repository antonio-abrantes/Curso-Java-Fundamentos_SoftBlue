package br.com.aula12f;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Aplicacao {

	public static void main(String[] args) {

		Map<Integer, Produto> map = new HashMap<>();
		//Map<Integer, Produto> map = new LinkedHashMap<>();
		//Map<Integer, Produto> map = new TreeMap<>();
		
		Produto p1 = new Produto(1, "Produto 1");
		Produto p2 = new Produto(1, "Produto 1");
		Produto p3 = new Produto(3, "Produto 3");
		
		map.put(1, p1);
		map.put(20, p2);
		map.put(3, p3);
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		Collection<Produto> values = map.values();
		
//		for(Produto p : values){
//			System.out.println(p);
//		}
		
		//Set<Map.Entry<Integer, Produto>> entries = map.entrySet();
		
//		for(Map.Entry<Integer, Produto> entry : entries){
//			System.out.println(entry.getKey() + " => "+entry.getValue() );
//		}

	}

}
