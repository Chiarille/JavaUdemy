package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		
		System.out.println("2" == s1);	//false;
		
		/*
		 * Mesmo que a variavel receba o mesmo valor que a string
		 * o resultado sera false.
		 */
		
		System.out.println("2".equals(s1));
		
		/*
		 * O modo correto de se fazer a comparacao de valores de sring
		 * e com a notacao ".equals()", pois ele ira considerar o conteudo
		 * e nao ira entrar em outra questao interna da linguagem que possa
		 * fazer com que haja essa diferenca de valores que acontece com o
		 * uso do "==".
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		
		/*
		 * ".next()" ignora espacos em branco
		 * ".nextLine()" imprime o valor mesmo que seja digitado valores em branco
		 */
		
		System.out.println("2" == s2);	//false
		System.out.println("2".equals(s2.trim()));	//true
		
		/*
		 * Funcionalidae ".trim()" serve para que caso haja espacos
		 * em branco no valor digitado, ele ira remover os espacos em branco
		 */
		
		entrada.close();
	}
	
}
