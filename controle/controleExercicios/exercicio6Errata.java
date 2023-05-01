package controle.controleExercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;
// não funcionou
public class exercicio6Errata {
	public static void main(String[] args) {
		System.out.println("--------------------------------");
		System.out.println("Bem-vindo ao jogo da adivinhacao");
		System.out.println("--------------------------------");
		System.out.println();
		int num = Integer.parseInt
				(JOptionPane.showInputDialog
						("Informe um número entre 0 e 100:"
								+ "\nNao deixe que vejam!"));
		while (num <= 0 && num >= 100) {
			num = Integer.parseInt
					(JOptionPane.showInputDialog
							("Número inválido, informe um número entre 0 e 100:"
									+ "\nMas ainda não deixe que vejam!"));
		}
		System.out.println("Muito bem! \nAgora o jogador tem"
				+ " 10 tentativas para acertar! \n"
				+ "Boa Sorte! ");
		int contador = 1;
		int tentativa = 1;
		Scanner entrada = new Scanner(System.in);
		do {
			contador++;
			System.out.println("Digite a"+ tentativa++ + "º tentativa:");
			int tentat = entrada.nextInt();
			 if (tentat != num) {
			 }
			 else {
				 System.out.println("Parabéns, você adivinhou o número!");
				 break;
			 }
		} while (contador <= 10);
		System.out.println("O numero informado foi: "+ num);
		System.out.println("Fim!");
		entrada.close();
		
	}

}
