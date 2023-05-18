package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new  HashMap<>();
		
		usuarios.put(1, "Lucas"); // para adicionar um valor na coleção tipo map utilizase o metodo .put()
		usuarios.put(2, "Rafaela");//caso na inserção dos valores ja exista uma chave igual, o valor sera trocado porém a chave continuara a mesma.
		usuarios.put(3, "Ricardo");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());//tamanho da collection igual para todos os tipos.
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());//exibe as chaves existentes
		System.out.println(usuarios.values());//exibe os valores existentes
		System.out.println(usuarios.entrySet());//exibe todo conteudo contido no map (chave e valor)
		
		System.out.println(usuarios.containsKey(4));//verifica se a chave colocada como parametro existe dentro do map
		System.out.println(usuarios.containsValue("Lucas"));//verifica se valor colocado como parametro existe dentro do map
		
		System.out.println(usuarios.get(1));//captura o valor referente a chave informada como parametro
		System.out.println(usuarios.remove(1));//remove o elemento da chave correspondente ao passado como parametro
		System.out.println(usuarios.remove(5, "Jeremias"));//remove o elemento correspondente a chave/valor passados como parametros caso a chave e o valor sejam referentes ao mesmo elemento.
		
		
		//Maneiras de percorer as chaves e os valores
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) { //Para percorer ambos os valores deve importar a classe Entry (java.util.Map.Entry)
			System.out.print("[ " + registro.getKey() + " ");//capturar a chave
			System.out.println(registro.getValue() + " ]");//capturar o valor
		}
		
	}
}
