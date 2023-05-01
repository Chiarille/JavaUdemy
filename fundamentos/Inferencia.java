package fundamentos;


public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		// caso a variavel receba um valor que determine seu tipo, ela não podera recever um valo que mude o tipo do valor da variael.
		/*
		 * ex:
		 * 
		 * var exemplo = "texto"; < aqui o java amarrou que o valor daquela variavel sera do tipo texto.
		 * exemplo = "42"; < aqui seria gerado um erro, porque o java devido a atribuição do valor de texto para a variavel "exemplo", não aceitaria receber um valor do tipo númerico.
		 * 
		 */
	}

}
