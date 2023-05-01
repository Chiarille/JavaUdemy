package controle.controleExercicios;

import java.util.Scanner;

public class exercicio2 {
//Criar um programa informa se o ano atual é um ano bissexto;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o ano: ");
		int ano = entrada.nextInt();
		
		if(ano%400==0 ||(ano%4==0 && ano%100!=0)) {
			System.out.println("O ano " +ano+ " é Bissexto" );
		}
		else {
			System.out.println("O ano "+ano+" não é Bissexto");
		}
		entrada.close();
	}

}
