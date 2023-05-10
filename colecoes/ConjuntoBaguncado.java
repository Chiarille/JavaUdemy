package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" }) //intencional o uso de valores heterogêneos
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		/*Como as coleções não suportam  tipos primitivos,
		 * o java efetua de maneira implícita as converções
		 * dos tipos.*/
		
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean  -> Boolean
		conjunto.add("Teste");// String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println(conjunto.size());//saber o tamanho do conjunto.
		
		conjunto.add("teste");
		System.out.println(conjunto.size());
		
		conjunto.add("teste");
		System.out.println(conjunto.size());/*Coleções não
		aceitam valores repetidos, então mesmo que seja adicionado
		o valor, o mesmo não sera considerado dentro do conjunto.
		No exemplo foi usado a palavra teste, e mesmo que anteriormente
		 a palavra teste sendo a mesma que Teste, a maneira como é escrita é 
		 levada em consideração e faz com que o java enxergue diferentes
		 valores.*/
		
		System.out.println(conjunto.remove("tEste"));/*Método remove tem como 
		retorno valor boolean, sendo que quando ele não conseguir remover algo
		da coleção, o valor do retorno sera false, e caso consiga remover um valor
		retornara true. Neste exemplo, como a palavra tEste não existe nessa coleção 
		ele retornara false.*/
		
		System.out.println(conjunto.remove("teste")); //true
		System.out.println(conjunto.size()); // 5
		
		Set nums = new HashSet(); // o uso do "Set" sera trabalhado em uma proxima aula.
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.retainAll(nums); /* Interseção dos conjuntos.
//		(Ira guardar apenas os valores em comum dos conjuntos*/
//		System.out.println(conjunto);

		conjunto.addAll(nums); //União de 2 coleções.
		System.out.println(conjunto);
		
		conjunto.removeAll(nums); /*Separação das coleções
		(Observação: Repare que no exemplo ambas as coleções possuem o valor "1" em
		comum, e ao serem unidas, apenas um dos dois "1" sera armazenado, por isso,
		ao remover a coleção nums, a coleção conjunto não possuira mais o valor "1" pois
		ele foi removido junto com a coleção nums.*/
		System.out.println(conjunto);
		
		
		
		
		
		
		
		
		
		
	}
}
