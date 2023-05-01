package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;	//a = a + 1;
		a--;	//a = a - 1;
		
		++b;	//b = b + 1;
		--b;	//b = b - 1;
		
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--); //valor de +1 "a" é igual -1 "b"?
		
		/*
		 * Neste exemplo o resultado sera "false".
		 * Como o operador da variavel "b" é postfix, ele sera
		 * um operador com menos prioridade na execução da sua função.
		 * Neste caso o operando "b" tera seu valor decrementado
		 * apos a operação de comparação.
		 * Operando "a" tera o incremento do valor antes da comparação;
		 * Por isso que somente na linha a baixo o resultado é "true".
		 */
		
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}

}
