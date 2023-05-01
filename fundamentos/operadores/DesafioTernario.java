package fundamentos.operadores;

import javax.swing.JOptionPane;

public class DesafioTernario {

	public static void main(String[] args) {

		
		//Código para comparar nota e comportamento para obtenção de desconto.
		//O desconto só e possivel caso o aluno passe de ano e tenha bom comportamento.
		//Reprovação OU mal comportamento anulam o desconto.
		//Os valores devem poder ser adicionados tanto com "," quanto ".". 
		
		
		String media = JOptionPane.showInputDialog("Digite a nota do aluno!");//PopUp para coleta dos dados.
		media = media.replaceAll(",", ".");//Replace (primeiro o valor que sera inserido, o valor que sera impresso no lugar do inserido.										
		double nota = Double.parseDouble(media);//Conversao de string para double para parametro de comparacao com a media.
		
		String resultadoParcial = nota >= 5.0 ? "em recuperacao." : "reprovado.";//Comparacao para saber se a nota do aluno o reprovou ou o deixou de recuperacao;
		String resultadoFinal = nota >= 7.0 ? "aprovado." : resultadoParcial;//2 Comparacao para saber se o aluno caso não seja reprovado, tenha ficado de recuperacao.
		System.out.printf("O aluno esta %s \n", resultadoFinal);//Impressao do resultado final da media do aluno.

		System.out.println("Sua media foi de: " + nota);//Impressao da media do aluno.

		String comportamento = JOptionPane.showInputDialog("O aluno teve bom comportamento?");//PopUp para coleta de dados.
		boolean resposta = comportamento.equalsIgnoreCase("sim");//Conversao string x boleano + comparacao de valor inputado. (true/false)
		boolean nota1 = nota >= 7;//Variavel parametro para obtencao do desconto atraves da comparacao de valores de nota e comportamento. (true/true)

		if (nota1 && resposta) {//Comparacao de valor

			System.out.println("O aluno vai receber desconto");//Mensagem para aprovacao no desconto.

		} else {

			System.out.println("O aluno nao vai receber desconto");//Mensagem para reprovacao do desconto.

		}

		

	}

}
