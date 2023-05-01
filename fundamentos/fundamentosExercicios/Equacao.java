package fundamentos.fundamentosExercicios;

public class Equacao {
	
	public static void main(String[] args) {

	// D = b^2 - 4*a*c
	// Math.sqrt(); <- Comando para calcular a raiz quadrada de um numero;
		
		double a = 1;
		double b = 12;
		double c = -13;
		double delta, deltaPositivo, deltaNegativo;
		
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("Valor de delta " + delta);
		
		deltaNegativo = (- b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Valor de delta negativo: " + deltaNegativo);
		
		deltaPositivo = (- b + Math.sqrt(delta)) / (2 * a);
		System.out.println("Valor de delta positivo: " + deltaPositivo);
		
		//System.out.println(Math.sqrt(delta));
		
	}

}
