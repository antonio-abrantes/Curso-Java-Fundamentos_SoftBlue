package br.com.aula12d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		String[] vet = {"Antonio", "Ana", "Jose"};
		
		l = Arrays.asList(vet);
		
		l.add("Maria");
		//l.add("abc");
		//l.add("def");
		//l.set(0, "ghi");
		//l.add(0, "ghi");
		
		for(String s : l){
			System.out.println(s);
		}
		
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
