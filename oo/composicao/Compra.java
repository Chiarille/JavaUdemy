package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionatItem(String nome, int quantidade, double preco) {
		this.adicionatItem(new Item(nome, quantidade, preco));
	}
	
	void adicionatItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
}
