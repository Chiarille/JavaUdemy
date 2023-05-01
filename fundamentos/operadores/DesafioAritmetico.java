package fundamentos.operadores;

public class DesafioAritmetico {
	
	public static void main(String[] args) {
		
		//Math.pow(base, expoente); 
		//Comando para criar potencias
		
		var a = 6 * (3 + 2);
		int b = (int) Math.pow(a, 2);
		var c = b / (3 * 2);
		System.out.println(c + "\n");
		
		var x = ((1-5) * (2 - 7)) / 2;
		int y = (int) Math.pow(x, 2);
		System.out.println(y + "\n");
		
		var z = c - y;
		int d = (int) Math.pow(z, 3);
		int f = (int) Math.pow(10, 3);
		var g = d / f;
		
		System.out.printf("Resultado = %d", g);
	
		
				
		
		
	}

}
