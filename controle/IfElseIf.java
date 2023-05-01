package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Informe a nota do aluno: ");
			double nota = Double.parseDouble(sc.next().replace("," , ".")); 
			
			if(nota >= 9.0 && nota <= 10){
				System.out.println("Quadro de Honra!");
				System.out.println("Voce e fera!!!");
			}
			
			if(nota > 10 || nota < 0) {
				System.out.println("Nota invalida");
			} else if(nota >= 7) {
				System.out.println("Aprovado");
			} else if(nota <= 7 && nota >= 5) {
				System.out.println("Recuperacao");
			} else {
				System.out.println("Reprovadinho");
			}
		sc.close();
		
	}

}
