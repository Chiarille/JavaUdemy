package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); // concatenação de strings
		System.out.println(s + "!!!"); // concatenação de strings
		System.out.println(s.startsWith("Boa")); // verificação para confirmar se a string se inicia com o valor atribuido entre as aspas, porém considera o valor de letras maiusculas e minusculas, tento como resultado de retorno sempre um valor booleano (true, false)
		System.out.println(s.toLowerCase().startsWith("boa")); // mesma função que a sentença acima, porem ao atribuir o .toLowerCase, a string e toda convertida em minusculas e assim depois e feito a comparação dos valores e também retorna sempre valor booleano.
		System.out.println(s.toUpperCase().startsWith("BOA")); // mesma função que a sentença acima porem ao inver de letras minusculas, aqui elas são convertidas para maiusculas, e da como retorno um valor booleano
		System.out.println(s.length()); //.length() mostra quantos caracteres tem a string e retorna um valor inteiro.
		System.out.println(s.toLowerCase().equals("boa tarde"));// compara o valor da frase inteira da mesma maneira que .startWith (que compara apenas o inicio) e .endsWith (que compara o final da frase), lembrando que as letras minusculas e maiusculas são levadas em consideração e retorna um valor booleano. 
		System.out.println(s.equalsIgnoreCase("boa tarde"));//  compara o valor da frase inteira porem ignora a diferença entre caracteres maiusculos e minusculos e também retorna um valor booleano.
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 2300.98;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		System.out.printf("O senhor %s %s tem %d anos e recebe um salario de R$%.2f.", nome, sobrenome, idade, salario);
		
		/*
		 * String.format serve como maneira alternativa de se criar frases concatenando strings e valores inteiros/ponto flutuante.
		 * %s = substitui por uma string
		 * %d = substitui por um valor inteiro
		 * %f = substitui por um valor com ponto flutuante, sendo possivel configurar para quantas casas decimas você deseja que seja mostrada:
		 * Ex: %.3f - ira mostrar 3 numeros apos a virgula.
		 */
		
		String frase = String.format( "\nO senhor %s %s tem %d anos e recebe um salário de R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}

}
