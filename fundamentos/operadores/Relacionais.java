package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);	//tabela unicode; // igual
		System.out.println(30 != 7);//diferente
		System.out.println(3 > 4);	//maior que
		System.out.println(3 >= 3);	//maior igual
		System.out.println(3 < 7);	//menor que
		System.out.println(3 <= 9);	//menor igual
		
		
		//verificação de um aluno para saber se ele obtera
		//desconto por bom comportamento e ter passado de ano
		//sendo que o desconto só sera possivel se o aluno tiver
		// nota 7+ e bom comportamento;
		
		double nota = 9.8;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.printf("Tem desconto? %s" ,temDesconto);
		
		
		
	}

}
