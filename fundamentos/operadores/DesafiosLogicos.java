package fundamentos.operadores;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
		//Trabalho na terça (true or false)
		//Trabalho na quinta(true or false)
		//terça e quinta = true = tv 50 + sorvete shopping
		//terça ou quinta = false = tv 32 + sorvete shopping
		//terca e quinta = false = nada;
		
		boolean terca = true;
		boolean quinta = false;
		
		
		boolean tv50 = terca && quinta;
		boolean tv32 = terca ^ quinta;
		boolean sorvete = terca || quinta;
		boolean emCasa = !sorvete;
		
		System.out.println(tv50);
		System.out.println(tv32);
		System.out.println(sorvete);
		System.out.println(emCasa);
		
	}

}
