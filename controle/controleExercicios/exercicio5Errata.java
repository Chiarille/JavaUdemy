package controle.controleExercicios;

import java.util.Scanner;
//não funcionou
public class exercicio5Errata {
//Refatorar o exercício 04, utilizando a estrutura switch.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// captura do numero
		System.out.println("Digite um número primo: ");
		int num = entrada.nextInt();
	
		// variavel para atribur true ou false para primo ou não primo.
		boolean primo = num%2==0||(num%3==0||(num%5==0||num%7==0));
		
		/*	verificação da variavel.
		 * 	System.out.println(primo);
		 */
		
		// conversão do valor true ou false para strings "0" e "1"
		// para servir como chave para o parametro do switch.
		String ultima = primo==true? "0":"1";
		switch(ultima) {
		case "1":
			System.out.println("É primo!");
			break;
		case "0":
		System.out.println("Não é primo!");
		}
		entrada.close();
		
	}
	
}
