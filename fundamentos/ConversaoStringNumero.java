package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		// Conversao String para numero;
		/*
		 * Double.parseDouble();
		 * Float.parseFloat();
		 * Long.parseLong();
		 * Integer.parseInt();
		 * Short.parseShort();
		 * Byte.parseByte();
		 */
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);

		System.out.println(numero1 + numero2);
		
		double somatoria = numero1 + numero2;
		
		System.out.printf("%.2f\n", somatoria);
		System.out.printf("%.2f\n", somatoria / 2);
		
		
	}

}
