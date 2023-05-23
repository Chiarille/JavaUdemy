package oo.composicao;

public class Carro {

	Motor motor;
	Porta porta = new Porta();//Porta instanciada.
	
	Carro(){
		this.motor = new Motor(this);
	}
	void acelerar() {
		if(motor.fatorInjecao < 2.6 && !porta.travaPorta)//Trava de segurança adicionada como
			//parametro para aceleração do motor
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) 
		motor.fatorInjecao -= 0.4;
	
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
