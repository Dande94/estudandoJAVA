package oo.composicao;

public class Carro {
	final Motor motor; //= new Motor();//Instância -> aqui indoco que o Carro tem um motor, para poder ter acesso a Classe Motor;
	
	//relação bidirecional
	Carro(){
		this.motor = new Motor(this);//passando objeto atual como parametro para construção do motor;
	}
	//relação bidirecional 
	
	
	void acelerar(){//metodo acelerar, pertence ao carro porém irá maniplar o motor;
		if(motor.fatorInjecao < 2.6) {//limitando o giro maximo do motor
			motor.fatorInjecao += 0.4;//toda vez que chamar esse metodo irá acrescentar 0.4 no giro do motor;			
		}
	}
	void frear(){//metodo frear, pertence ao carro porém irá maniplar o motor;
		if(motor.fatorInjecao > 0.5) {//limitando o giro minimo do motor
			motor.fatorInjecao -= 0.4;			
		}
	}
	void ligar() {//metodo que altera o valor da variavel ligado da Classe Motor
		motor.ligado = true;
	}
	
	void desligar() {//metodo que altera o valor da variavel ligado da Classe Motor
		motor.ligado  = false;
	}
	boolean estaLigado() {//verificar o valor da variavel ligado da classe carro, dependendo do valor setado, irá habilitar ou desabilitar funções do motor;
		return motor.ligado;
	}
}
