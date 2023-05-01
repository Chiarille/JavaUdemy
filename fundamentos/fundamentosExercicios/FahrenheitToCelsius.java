package fundamentos.fundamentosExercicios;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double celsius, fahren;
		
		System.out.println("Conversor te temperaturas Fahrenheint x Celsius\n");
		
		System.out.print("Informe a temperatura em fahrenheint: ");
		fahren = Double.parseDouble(entrada.next().replace(",", "."));
		
		celsius = (fahren - 32) / 1.8;
		
		System.out.println("\nTemperatura em Celsius: " + celsius);

		entrada.close();
		
		
	}

}
