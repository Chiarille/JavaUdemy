package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Lucas Chiarille";
		u1.email = "l.chiarille@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Lucas Chiarille";
		u2.email = "l.chiarille@gmail.com";
		
		System.out.println(u1 == u2);// false -> faz comparação pelo endereço de memória
		System.out.println(u1.equals(u2));// false **>> SE <<** não ouver sido implementado um parametro para equals
		// na classe do objeto
		System.out.println(u1.equals(u2));
		
		
		/* Por padrão o metodo equals tem o mesmo modo de comparação que o do operador ==, comparar valores pelo endereço
		 * da memória, por isso para comparação de valores entre objetos, deve-se determinar (dentro da classe do objeto)
		 * qual o parametro a comparação, critério. */
		
		/* O hascode será abordado em outra aula. */
	}
}
