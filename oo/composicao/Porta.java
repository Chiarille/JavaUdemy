package oo.composicao;

public class Porta {
	
	boolean travaPorta = false; //Sistema de segurança para portas abertas. false = porta fechada,
	//Logo a trava não esta acionada.

	boolean abrirPorta() {
		return travaPorta = true;
	}
	
	boolean fecharPorta() {
		return travaPorta = false;
	}
	
	boolean portaAberta() { //Metodo para verificar se a porta esta aberta.
		return travaPorta;
	}
}
