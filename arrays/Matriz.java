package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos tem na turma?");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas cada aluno tem?");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int i = 0; i < notasTurma.length; i++) {
			for (int j = 0; j < notasTurma.length; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", (j + 1), (i + 1));
				notasTurma[i][j] = entrada.nextDouble();
				total += notasTurma[i][j];
			}
		}
		
		double mediaTurma = total/ (qtdeAlunos * qtdeNotas);
		System.out.println("A média da turma é " + mediaTurma);
		
		for(double[] notas: notasTurma) {
			System.out.println(Arrays.toString(notas));
		}
		
		entrada.close();
	}

}
