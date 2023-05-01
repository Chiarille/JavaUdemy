package fundamentos;

public class AreaDaCircunferencia {

	public static void main(String[] args) {
		// int váriaveis inteiras
		int raio = 8;
		// double váriaveis com ponto flutuante
		double pi = 3.14159;
		// final serve para bloquear a mundança de valor de uma variavel
		// final double fim = 3.14159;
		
		double area = pi * raio * raio;
		
		System.out.println(area);
		
		//para mudar o valor de uma variavel ja utilizada, repete-se apenas o nome da variavél atribuindo o novo valor
		// caso a varial esteja usando o comando final, não sera possivel alterar o valor da variavel
		raio = 25;
		area = pi * raio * raio;
		System.out.println(area);
			
	}
	
}
