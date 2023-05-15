package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila.
		
		/*A diferença é o comportamento que ocorre
		 * quando a fila esta >>> CHEIA <<<*/
		
		fila.add("Lucas"); //Lança uma exceção (ERRO);
		fila.offer("Chiarille"); //Retorna false; 
		fila.add("Erin");
		fila.offer("Bastet");
		fila.add("Frigg");
		
		//Peek e Element -> Captura o elemento da fila.(Sem remover)
		
		/*A diferença é o comportamento que ocorre quando
		 * a fila esta >>> VAZIA <<<.*/
		System.out.println(fila.peek());//Retorna null;
		System.out.println(fila.peek());
		System.out.println(fila.element());//Lança uma exceção; (ERRO)
		System.out.println(fila.element());
		
		//Pool e remove -> Captura o elemento da vez na fila e em seguida o remove.
		/*A diferença é o comportamento quando a fila esta >>> VAZIA <<<.*/
		
		System.out.println(fila.poll());//Retorna null;
		System.out.println(fila.poll());
		System.out.println(fila.remove());//Lança uma exceção;(ERRO)
		System.out.println(fila.remove());
		
		/*fila.size();
		 * fila.clear();
		 * fila.isEmpty();F */
	}

}
