package fundamentos;

public class Temperatura {
	public static void main(String[] args) {

		/*
		 * (°F - 32) / 1,8 = °C (°F - 32) x 5/9.0 = °C [Para divisão de numeros inteiros
		 * deve sempre se colocar 1 com o sentido de valor real.
		 */

		double F = 100;
		double AJUSTE = 1.8;
		double C = (F - 32) / AJUSTE;
		System.out.println(C + "°C");

		AJUSTE = 5 / 9.0;
		F = 96.8;
		C = (F - 32) * AJUSTE;
		System.out.println(C + "°C");
	}

}
