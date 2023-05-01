package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		// Conversao de um numero (primitivo) para uma String atraves da notacao .toString();
		
		/*
		 * Conversao atraves da criacao de uma classe wapper;
		 */
		
		Integer num1 = 1000;
		
		System.out.println(num1.toString().length());
		
		/*
		 * Conversao atraves do uso direrto de uma classe wapper em uma classe primitiva
		 */
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		/*
		 * Conversao atraves de uma concatenacao de uma String vazia com uma classe primitiva;
		 */
		
		System.out.println(("" + num2).length());
	}

}
