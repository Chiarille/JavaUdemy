package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		// Calcular a media de uma turma de quantidade indefinida
		// digitar uma nota >=0 <=10 para ser uma nota valida
		// saida do programa -1
		// informar quantas notas validas foram informadas
		

		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		int contNotaVal = 0;
		int notasInfTotal = 0;
		
		while (!(nota == -1)) {

			System.out.println("Digite a nota: ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total = total + nota;
				++contNotaVal;

			} else if (nota > 10 || nota < -1) {
				
				System.out.println("Informe uma nota valida ");
				++notasInfTotal;
				
			}

		}
	
		double media = (double) total / contNotaVal;
		
		System.out.println("Nota total da turma foi: " + total);
		System.out.println("Quantas notas validas foram informadas? " + contNotaVal);
		System.out.println("Quantas notas totais foram informadas? " + (notasInfTotal+contNotaVal));
		System.out.printf("A media da turma foi: %.2f pts", media);
	
		entrada.close();
	}

}
