package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora2 {
	
	//ler num1
	//ler num2
	// + - * / %
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		String valor1 = entrada.next().replace(",", ".");
		double num1 = Double.parseDouble(valor1);
		
		System.out.println("Digite outro valor: ");
		String valor2 = entrada.next().replace(",", ".");
		double num2 = Double.parseDouble(valor2);
		
		System.out.println("Digite a operacao: ");
		String operador = entrada.next().trim();
		
		System.out.println(operador.equals("+") ? "resultado: " +(num1 + num2) :
			operador.equals("-") ? "resultado: " + (num1 - num2) :
				operador.equals("*") ? "resultado: " + (num1 * num2) :
					operador.equals("/") ? "resultado" + (num1 / num2) :
						operador.equals("%") ? "resultado" + (num1 % num2) : "Operacao invalida");
		
		entrada.close();
		
	}

}
