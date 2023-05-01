package controle.controleExercicios;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String plv = entrada.nextLine();
		int num = 0;
		while (num<plv.length()) {
			System.out.println(plv.substring(num, ++num));
		}
		entrada.close();
	}
}
