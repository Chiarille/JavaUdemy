package fundamentos.fundamentosExercicios;

import java.util.Scanner;

public class TrianguloArea {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int base, altura;
		double area;
		
		System.out.print("Informe o valor da base do triangulo: ");		
		base = Integer.parseInt(sc.next());		
		System.out.print("Informe o valor da altura do triangulo: ");		
		altura = Integer.parseInt(sc.next());
		
		area = (double) (base * altura) / 2;
		
		System.out.println("\n===============================");
		System.out.printf("A area do triangulo e: %.2f\n", area);
		System.out.println("===============================");
		
		sc.close();
		
	}

}
