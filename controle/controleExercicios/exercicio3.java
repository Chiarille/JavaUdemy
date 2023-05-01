package controle.controleExercicios;

import java.util.Scanner;

public class exercicio3 {
//Criar um programa que receba duas notas parciais,
//calcular a média final. Se a nota do aluno for maior ou igual a 7.0
//imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0
// imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a nota da primeira prova:");
		double nota1 = entrada.nextDouble();
		System.out.println("Informe a nota da segunda prova:");
		double nota2 = entrada.nextDouble();
		double notaFinal = (nota1+nota2)/2;
		if(notaFinal>=7) {
			System.out.println("Aluno aprovado.");
		}
		else if (notaFinal<7 && notaFinal>=4) {
			System.out.println("Aluno em recuperação.");
		}
		else {
			System.out.println("Aluno esta reprovado.");
		}
		
		entrada.close();
		
	}

}
