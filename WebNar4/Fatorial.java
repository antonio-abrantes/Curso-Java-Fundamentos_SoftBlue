import java.util.Scanner;
//import java.math.BigDecimal;

public class Fatorial {
	public static void main(String[] args) {

		int inte, pot, um = 1, nove = 9;
		Scanner in = new Scanner(System.in);

		inte = in.nextInt();

		while (inte > 0) {

			pot = in.nextInt();

			if (pot % 2 == 0) {
				System.out.println(um);
			} else {
				System.out.println(nove);
			}

			// BigDecimal fat = new BigDecimal(Math.pow(9, 6));

			// String numero = fat.toString();

			// System.out.println("Resultado = " + numero);
			// int ultimo = numero.length() -1;

			// char aChar = numero.charAt(ultimo);

			// System.out.println(aChar);
			// System.out.println(Math.pow(10, 9));
			inte--;

		}
	}
}
