package controle.controleExercicios;

import java.util.Scanner;

public class exercicio7 {
	
	/*Criar um programa que enquanto estiver recebendo números
	 *  positivos, imprime no console a soma dos números 
	 *  inseridos, caso receba um número negativo, encerre
	 *   o programa. Tente utilizar a estrutura do while.*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int numero1 = 0;
		while (numero>=0) {
			numero1=numero+numero1;
			System.out.println("Digite um numero positivo para somar"
					+ " e um negativo para saber o valor total digitado: ");
			numero = entrada.nextInt();
			
		}
		System.out.println("Valor total digitado " + numero1);
		entrada.close();
		System.out.println("fim");
	}
}
