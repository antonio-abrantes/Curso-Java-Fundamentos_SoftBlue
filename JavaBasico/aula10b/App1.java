package br.com.aula10b;

public class App1 {

	public static void main(String[] args) {
		
		int num = 20;

		Integer i1 = new Integer(num);
		impimir(i1);
		
		Double i2 = new Double(23.5);
		impimir(i2);
		
		String bin2 = Integer.toHexString(254);
		System.out.println(bin2);
		
		//String bin3 = Integer.toBinaryString(256);
		int bin3 = Integer.parseInt(Integer.toBinaryString(256));
		System.out.println(bin3);
	}
	
	private static void impimir(Object obj){
		System.out.println(obj);
	}

}
