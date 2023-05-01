package controle.controleExercicios;

import java.util.Scanner;

public class exercicio4Corrigido {
/*Criar um programa que receba  um número e diga se ele é um
 * número primo */
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nDigite um número para verificar se é primo:");
		int numero = entrada.nextInt();
		
		// for() para teste de divisores, se o número for divisivel por qualquer número entre 2 e ele mesmo, ele
		// tera mais do que 2 divisores, então contadorDeDivisores++.
		// A variavel "i" determina que além do número 1, se o número for divisivel por qualquer outro além dele mesmo,
		// ele sera um numero primo.
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		//Checagem saber se o número é primo ou não.
		// se tiver mais que 2 divisores = não e primo
		// então se contadorDeDivisores == 0, ele é primo.
		
		if(contadorDeDivisores == 0 ) {

			System.out.println("\nO numero " + numero + " é primo.");
			
		} else {
			
			System.out.println("\nO numero " + numero + " não é primo.");
			
		}
		
		entrada.close();
		
	}
}
