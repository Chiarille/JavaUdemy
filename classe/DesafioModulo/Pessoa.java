package classe.DesafioModulo;

public class Pessoa {
	
	Comida alimento = new Comida();
	
	String nomePessoa;
	int pesoPessoa;
	
	int comer(int pesoComida) { 
		alimento.pesoComida = pesoComida;
		pesoPessoa += pesoComida;
		return pesoPessoa;
	}

}
