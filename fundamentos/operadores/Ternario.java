package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 5.6;
		String resultadoFinal =  media >= 7.0 ? "aprovado" : "reprovado";
		System.out.println("O aluno esta " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "nao";
		System.out.println("Tem desconto? " + resultado);
		
	}

}
