 package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2 + "\n");
		
		System.out.println("Tabela verdade E (AND)(&&)");

		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
//		System.out.println(false && true);	//false
//		System.out.println(false && false);	//false
		//Operador lógico && (and) só retornara "true" se todos os valores forem "true";
		
		System.out.println("\nTabela verdade OU (OR)(||)");

//		System.out.println(true || true);	//true
//		System.out.println(true || false);	//true
		System.out.println(false || true);	//true
		System.out.println(false || false);	//false
		//Operador lógico || (or) caso 1 valor seja "true" o retorno sera "true";
		
		System.out.println("\nTabela verdade OU Exclusivo (XOR)(^)");
		
		System.out.println(true ^ true);	//false
		System.out.println(true ^ false);	//true
		System.out.println(false ^ true);	//true
		System.out.println(false ^ false);	//false
		//Operador lógico ^ (xor) retornara "true" apenas se um valor for "true", caso seja 2 valores como "true" o restorno sera "false";
		
		System.out.println("\nTabela verdade Negacao (NOT)(!)");
		
		System.out.println(!true);	//false
		System.out.println(!false);	//true
		//Operador lógico ! (not) é um operador unário, caso utilizado, ira sempre retornar o valor oposto do valor de referencia, a menos que seja utilizado 2x (!!) no caso o valor sera o mesmo;
		
	}

}
