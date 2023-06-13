package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		 
		Compra compra1 = new Compra();
		compra1.cliente = "Lucas";
		compra1.adicionatItem("Caneta", 20, 7.45);
		compra1.adicionatItem("Borracha", 10, 14.90);
		compra1.adicionatItem("Caderno", 5, 29.8);
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
				
	}
}
