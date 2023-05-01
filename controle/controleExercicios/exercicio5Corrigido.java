package controle.controleExercicios;

import java.util.Scanner;

public class exercicio5Corrigido {

	public static void main(String[] args) {
		
		
		/** 5. Refatorar o exercício 04, utilizando a estrutura switch. */

		//for para verificação do número pra saber se é ou não primo.
		
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		
		// a aplicação do switch estava correta
		
		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}

		scanner.close();

	}
	
}
