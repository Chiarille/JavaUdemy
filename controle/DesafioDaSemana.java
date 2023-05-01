package controle;

import java.util.Scanner;

public class DesafioDaSemana {
		/*
		 * Imprimir número conforme o dia da semana informado;
		 * domingo = 1 
		 * segunda = 2
		 * terça = 3
		 * quarta = 4
		 * quinta = 5
		 * sexta = 6
		 * sabado = 7
		 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe o dia da semana: ");
		String diaDaSemana = sc.next();
	
		if (diaDaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (diaDaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (diaDaSemana.equalsIgnoreCase("terça") ||
				diaDaSemana.equalsIgnoreCase("terca")) {
			System.out.println("3");
		} else if (diaDaSemana.equalsIgnoreCase("quarta")) {
		System.out.println("4");
		} else if (diaDaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (diaDaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (diaDaSemana.equalsIgnoreCase("sabado") ||
				diaDaSemana.equalsIgnoreCase("sábado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia informado invalido");
		}
		
	
		sc.close();
		
		
	}
}
