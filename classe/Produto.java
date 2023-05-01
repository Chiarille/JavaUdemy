package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	double	produtoComDesconto(){
		return preco * (1 - desconto);
	}
	
	double produtoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));		
	}
}
