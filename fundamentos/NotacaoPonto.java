package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom Dia X";
		s = s.replace("X", "Senhora"); // sentença para substituir a letra X pela palavra senhora.
		s = s.toUpperCase(); // sentença para converter todas as letras em maiusculas.
		s = s.concat("!!!"); // sentença para concatenar uma string em uma frase.

		/*
		 * Válido ressaltar que o operador "." se aplica apenas em sentenças que tenham
		 * como valor/ resultado Strings, sendo assim, não funciona com valores
		 * inteiros.
		 */

		System.out.println(s);

		String x = "Leo".toUpperCase();
		System.out.println(x);

		/*
		 * sentenças com o operador "." podem ter as linhas quebradas antes ou depois do
		 * ponto(não é possivel dividir as palavras).
		 */
		String y = "Bom Dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);

	}
}
