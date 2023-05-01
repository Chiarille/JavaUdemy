package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(19 + 8);
		
		var x = 5;
		var y = 18;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(y / (double) x);	
		System.out.println(x / (float) y);	
		System.out.println(x % y + "\n");
		
		var a = 3.88;
		double b = 6.99;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	
		System.out.printf("Remember variavel x %d, y %d, a %.1f, b %.2f", x, y, a, b);
				
		
	}

}
