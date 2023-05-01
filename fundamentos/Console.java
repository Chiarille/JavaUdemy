package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //Scanner serve para escanear uma entrada que deve ser definida entre paraenteses, podendo tanto ser informações coletadas pela entrada do mouse, teclado e ate mesmo arquivos.
		 
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine(); // .nextLine aceita somente strings como valor
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();// .nextInt aceita somente valores inteiros
		
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();// .nextInt aceita somente valores inteiros
		
		System.out.printf("\n\nNome completo: %s %s, tem %d anos e tem %.1f m.", nome, sobrenome, idade, altura);
		
		entrada.close(); //o scanner deve ser sempre fechado pois ele continua consumindo recurso da maquina ate que seja fechado. 	
	
		/* Lembrete
		 * %d	= representa números inteiros;
		 * %f	= representa números floats;
		 * %2f	= representa números doubles, aonde você escolhe quantas casas decimais serão exibidas.
		 * %b	= representa valores booleanos;
		 * %c	= representa valores char;
		 */
		
		/*		
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();

		System.out.println("Qual a sua idade?");
	    int idade = teclado.nextInt();
	    teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.
	    System.out.println("Qual o seu nome?");
	    String nome = teclado.nextLine();
	    System.out.println("Qual o seu sobrenome?");
	    String sobrenome = teclado.nextLine();
		 */
	}
}
