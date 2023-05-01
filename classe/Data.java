package classe;

public class Data {
	
	int	dia;
	int mes;
	int ano;
	
	Data (){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data (int dia1, int mes1, int ano1 ){
		dia = dia1;
		mes = mes1;
		ano = ano1;
			
	}
	
	String obterDataFormatada() {
		return dia + "/" + mes + " /" + ano  ;
	}

}
