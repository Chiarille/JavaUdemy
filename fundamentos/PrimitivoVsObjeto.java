package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {

		String s = "texto";
		System.out.println(s.toUpperCase()); // notação .toUpperCase atribui um comportamento a o objeto string

		// Wrapper são as versões objeto dos tipos primitivos.
		// Válido lembrar que tudo no java e reconhecido como objeto menos valores
		// primitivos;
		// byte, short, int, long / boolean, char/ float e double.

		int a = 123;
		System.out.println(a);

	}

}
