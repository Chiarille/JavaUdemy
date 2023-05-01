package fundamentos;

public class Wrapper {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l  / 3);
		
		Float f = 123.10F; //Para que seja reconhecido como Float é necessário que no final no número seja adicionado a letra F maiuscula;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(s.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "..." + "é é é ");
		
	}

}
