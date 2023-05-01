package controle;

public class If {
	
	public static void main(String[] args) {
		
		double nota = 8.3;
		
		if(nota >= 9.0){
			System.out.println("Quadro de Honra!");
			System.out.println("Voce e fera!!!");
		}
		
		if(nota >= 7)
			System.out.println("Aprovado");
		
		if(nota <= 7 && nota >= 5)
			System.out.println("Recuperacao");
			
		if(nota < 5)
			System.out.println("Reprovadinho");
		
	
	}

}
