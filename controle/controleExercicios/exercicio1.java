package controle.controleExercicios;

import java.util.Scanner;

public class exercicio1 {
//Criar um programa que receba um número e verifique
//	se ele está entre 0 e 10 e é par;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um valor entre 0 e 10: ");
		int valor = entrada.nextInt();
		
		if (valor>=0 && valor<=10) {
			valor = valor%2;
			String parImpar = valor==0? "par." : "impar.";
			System.out.println("O número informado é " + parImpar);
		}
		else {
			System.out.println("Número informado inválido, informe"
					+ " um numero entre 0 e 10");
		}
		entrada.close();
	}
}
