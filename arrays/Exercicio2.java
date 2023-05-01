package arrays;

import java.util.Arrays;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		double notaSurpresaA = 9.6;
		
		notasAlunoA[0] = 6.66 ;
		notasAlunoA[1] = 8.97;
		notasAlunoA[2]= 9.7;
		notasAlunoA[3]= notaSurpresaA;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		// System.out.println(notasAlunoA[4]); !ERRO
		
//		for (int i = 0; i < notasAlunoA.length; i++) {
//			total += notasAlunoA[i];
//		}
		
		for(double nota : notasAlunoA) {
			System.out.print(nota + " Foreach ");
		}

		System.out.println(total / notasAlunoA.length);
		
		double notaSurpresa = 6.8;
		double[] notasAlunoB = {7.8, 8.5, 9.6, notaSurpresa, 8.3};
		
		System.out.println(Arrays.toString(notasAlunoB));

		double totalAlunoB = 0;
		
//		for (int i = 0; i < notasAlunoB.length; i++) {
//			totalAlunoB += notasAlunoB[i];
//		}
		
		for (double nota : notasAlunoB) {
			System.out.print(nota + " Foreach ");
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
