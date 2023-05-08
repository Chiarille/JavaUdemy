package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoOrganizado {
	
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
/*		SortedSet<String> lista = new TreeSet<>(); TreeSet = lista os valores 
 * 		conforme a ordem de inserção*/
/*		SortedSet = Set que aceita um critítério como forma de organizar o conjunto*/
//		Set<String> lista = new HashSet<>(); -  Mesma coisa;
		lista.add("Lucas");
		lista.add("Chiarille");
		lista.add("Lemos");
		lista.add("de");
		lista.add("Sousa");
		
		for (String nome: lista) {
			System.out.println(nome);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
//		nums.get(1); Não é possivel acessar pelo índice.
		
		for (int num: nums) {
			System.out.println(num);
		}
		
		
	}
}
