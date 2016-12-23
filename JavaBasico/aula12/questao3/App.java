package br.com.aula12.questao3;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void read() throws Exception {
		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		//l.add(3);
		
		for(String s : l) {
			System.out.println(s);
		}
	}

}
