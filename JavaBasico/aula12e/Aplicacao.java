package br.com.aula12e;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		//Set<String> set = new LinkedHashSet<>();	
		//Set<String> set = new TreeSet<>();	
		
		
		set.add("F2");
		set.add("F2");
		set.add("C5");
		set.add("B6");
		set.add("D4");
		set.add("E3");
		set.add("A7");
		set.add("G1");
		set.add("F2");
		
		
		System.out.println(set);
		

	}

}
