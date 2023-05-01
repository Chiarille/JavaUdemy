package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Todas");
		case "marrom":
			System.out.println("Calcanhar");
		case "roxa":
			System.out.println("Leg Lock");
		case "azul":
			System.out.println("Mão de vaca");
		case "branca":
			System.out.println("Armlock");
		break;
		default:
			System.out.println("Sei de nada");
		}
		
	}

}
