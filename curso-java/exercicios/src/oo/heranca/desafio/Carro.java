package oo.heranca.desafio;

public class Carro {
	int velocidadeAtual = 0;
	int velocidadeMinima = 0;
	
	boolean acelerar(){
		velocidadeAtual += 5;
		return true;
		
	}
	boolean frear(){
		if(velocidadeAtual > velocidadeMinima) {
			velocidadeAtual -= 5;
		}
		return true;
		

	}
}
