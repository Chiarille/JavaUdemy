package controle.controleExercicios;

import java.util.Scanner;
// não funcionou
public class exercicio4Errata {
// . Criar um programa que receba um número e diga se ele é um número primo.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número primo: ");
		int num = entrada.nextInt();
		
		if(num%2==0 ||
				num%3==0 ||		
					num%5==0 || 
						num%7==0) { 			System.out.println("O número informado não é primo.");
		}
		else {
			System.out.println("O número informado é primo.");
		}
		entrada.close();
	}
	
}
