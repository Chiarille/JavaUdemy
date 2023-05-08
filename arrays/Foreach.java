package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double [] notas = {2.75, 3.68, 9.65, 7.99};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for (double nota: notas) {
			System.out.print(nota + " ");
		}
	}

}
