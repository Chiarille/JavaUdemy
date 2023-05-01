package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		 
		//Calculadora media salarial.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite o primeiro salario: ");
		String salario1 = scn.nextLine().replaceAll(",", ".");
		System.out.print("Digite o segundo salario: ");
		String salario2 = scn.nextLine().replaceAll(",", ".");
		System.out.print("Digite o terceiro salario: ");
		String salario3 = scn.nextLine().replaceAll(",", ".");
		
		double pagamento1 = Double.parseDouble(salario1);
		double pagamento2 = Double.parseDouble(salario2);
		double pagamento3 = Double.parseDouble(salario3);
		
		System.out.println("A media salarial e de: " + (pagamento1 + pagamento2 + pagamento3)/3);
		
		
		
		scn.close();
	}
}