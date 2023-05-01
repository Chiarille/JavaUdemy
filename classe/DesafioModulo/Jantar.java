package classe.DesafioModulo;

public class Jantar {
	
	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa();
		Comida rango = new Comida();
		
		p1.nomePessoa = "Junin";
		p1.pesoPessoa = 70;
		
		System.out.println("Antes da refeição, " + p1.nomePessoa + " pesava " +  p1.pesoPessoa + "KG");
		
		p1.comer(rango.comida1());
		p1.comer(rango.comida2()); 		
		p1.comer(rango.comida3());
		p1.comer(rango.comida3());
		p1.comer(rango.comida3());
		
		System.out.println("Depois de comer ficou com um peso total de " + p1.pesoPessoa + "KG");
		
	}
}