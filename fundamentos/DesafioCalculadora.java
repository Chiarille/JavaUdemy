package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	//ler num1
	//ler num2
	// + - * / %
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		String valor1 = entrada.next().replace(",", ".");
		double num1 = Double.parseDouble(valor1);
		
		System.out.println("Digite outro numero: ");
		String valor2 = entrada.next().replace(",", ".");
		double num2 = Double.parseDouble(valor2);
		
		System.out.println("Digite a operacao: ");
		String op = entrada.next();
		
		if (op.equals("*".trim())) {
			
			System.out.println("O resultado e: " + (num1 * num2));
		
		} else if (op.equals("+".trim())) {
			
			System.out.println("O resultado e: " + (num1 + num2));
		
		} else if (op.equals("-".trim())) {
			
			System.out.println("O resultado e: " + (num1 - num2));
			
		} else if (op.equals("/".trim())) {
			
			System.out.println("O resultado e: " + (num1 / num2));
			
		} else if (op.equals("%".trim())) {
			
			System.out.println("O resultado e: " + (num1 % num2));
			
		} else {
			
			System.out.println("Operacao invalida");
			
		}
	
		
		entrada.close();
		
	}

}
