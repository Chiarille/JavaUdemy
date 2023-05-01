package fundamentos.fundamentosExercicios;

import javax.swing.JOptionPane;

public class CelsiusToFahrenheit {
	
	//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	
	public static void main(String[] args) {
		
		double celsius, fahren;
		
		celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius: ").replace(",","."));
		
		fahren = (celsius * 1.8) + 32;
		
		System.out.printf("Temperatura em Celsius: %.2f", fahren);
		
	}

}
