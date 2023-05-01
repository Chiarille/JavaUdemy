package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		Produto p1 = new Produto();	// instaciar uma classe.
		
		p1.nome = "Notebook";
		p1.preco = 1000;
	//	p1.desconto = 0.66;
		
		Produto.desconto = 0.69;
		
		var p2 = new Produto();		// embora tenha sido utilizado o "var" ou invés de "Produto" (Nome da classe)
		// o java consegue inferir o tipo (classe) pelo valor.
		
		p2.nome = "Caneta Preta.";
		p2.preco = 10;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal = p1.produtoComDesconto();
		double precoFinal2 = p2.produtoComDesconto(0.3);
		double mediaCarrinho = ((precoFinal + precoFinal2)/ 2);
		
		System.out.printf("%.2f",precoFinal);
		System.out.printf("\n%.2f", precoFinal2);
		System.out.printf("\nA média do carrinho é %.2f ", mediaCarrinho);
		
	}

}