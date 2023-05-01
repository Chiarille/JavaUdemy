package fundamentos.fundamentosExercicios;

import java.util.Scanner;

public class AoQuadradoAoCubo {
	
	//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num;
		String exp;
		
		System.out.println("Informe o numero que voce deseja saber o seu valor elevado ao quadrado ou ao cubo: ");
		num =  Double.parseDouble(entrada.next());
		System.out.println("Escolha o expoente, ao quadrado [2], ao cubo [3](Digite um dos dois numeros): ");
		exp = entrada.next();
		
		System.out.println(exp.equals("2") ? num + " ao quadrado e " + (num * num) : 
			exp.equals("3") ? num + " ao cubo e " + (num * num * num) : 
				"Valor inválido, escolha entre 2 e 3.");
		
		entrada.close();

	}

}
