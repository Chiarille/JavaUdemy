package fundamentos.fundamentosExercicios;

import java.util.Scanner;

public class IMC {
	
	//Criar programa que calcule o IMC (IMC = Peso x Altura^2)
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.print("Informe seu Peso: ");
		peso = Double.parseDouble(entrada.next().replace(",", "."));
		
		System.out.print("Informe seu Altura: ");
		altura = Double.parseDouble(entrada.next().replace(",", "."));
		
		imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC e: %.2f", imc);
		
		entrada.close();
		
		
	}
	

}
