package arrays;

import java.util.Scanner;

public class DesafioForeach {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe a quantidade de notas: ");
		int quantNotas = entrada.nextInt();
		double[] notasAluno = new double[quantNotas];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			double nota = entrada.nextDouble();
			notasAluno[i] = nota;
		}
		
		double notaTotal = 0;
		for(double nota: notasAluno) {
			notaTotal += nota;
		}
		
		double notaMedia = notaTotal / (int)notasAluno.length;
		System.out.printf("A média do aluno é: %.1f", notaMedia);
		
		entrada.close();
	}

}
