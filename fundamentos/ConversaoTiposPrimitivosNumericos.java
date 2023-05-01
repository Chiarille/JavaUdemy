package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888; // conversão explícita (CAST), aqui é informado ao java que mesmo o que a classe não suporte o valor, o valor sera convertido para o valor que a classe suporta.
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // conversão explicita, neste exemplo, o valor ira ser contato ate o limite que a classe suporta, e assim ao chegar ao final, ele ira começar a contar do menor valor e sucetivamente
		// neste caso ele ira sair do menor valor -127 e ira contar ate o 128 que é o valor que o byte suporta, e ao chegar no maior valor, se o numero ainda sim for maior, ele ira reiniciar e começar a contrar novamente do menor valor para o maior
		
		double e = 1.999999;
		int f = (int) e; // conversão explicita, neste exemplo como a classe int não considera valor de ponto flutuante o valor apos o "." sera simplesmente ignorado, de modo que o java não ira nem considerar arredondar o número.
	
		System.out.println("conversão explicita / implicita" + "\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
	}

}
