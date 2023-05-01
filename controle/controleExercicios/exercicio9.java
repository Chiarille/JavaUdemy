package controle.controleExercicios;

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 10 valores");
		int contador = 1;
		int maxValor = 0;
		while (contador<=10) {
			System.out.println("Digite o " + contador +"º valor");
			int valores = entrada.nextInt();
			if(valores>maxValor) {
				maxValor = valores;
			}
			contador++;
		}
		System.out.println("O maior valor digitado foi " + maxValor);
		entrada.close();
	}
}
