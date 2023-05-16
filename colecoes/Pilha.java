package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe");/*Retorna true caso consiga adicionar um item na pilha
		e retorna false caso não consiga inserir o item na pilha*/
		livros.push("Don Quixote");/*Caso não consiga inserir o item na pilha sera gerado uma
		exceção(ERRO), pode acontecer em casos quando a pilha tiver um limite estipulado*/
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); //Mesmo comportamento que o da List
		System.out.println(livros.element()); //Mesmo comportamento que o da List
		
		System.out.println(livros.poll()); //Mesmo comportamento que o da List
		System.out.println(livros.remove()); //Mesmo comportamento que o da List
		System.out.println(livros.pop()); //Mesmo comportamento que o metodo .remove()
		
//		livros.size();
//		livros.clear();
//		livros.contains(...);
//		livros.isEmpty();
		
		livros.add("123");
		livros.add("123");
		livros.push("321");
		livros.push("321");
		
		for (String livro: livros) {
			 System.out.println(livro);
		}
		
	}
}