package oo.heranca.desafio;

public class Carro {
	final int VELOCIDE_MAXIMA;
	int velocidadeAtual = 0;
	int velocidadeMinima = 0;
	int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDE_MAXIMA = velocidadeMaxima;
	}
	
//	boolean acelerar(){
//
//		velocidadeAtual += delta;
//		return true;	
//	}
//	boolean frear(){
//		if(velocidadeAtual > velocidadeMinima) {
//			velocidadeAtual -= delta;
//		}
//		return true;
//	
//	}
//resposta do professor
		void acelerar(){
			if(velocidadeAtual + delta > VELOCIDE_MAXIMA) {
				velocidadeAtual = VELOCIDE_MAXIMA;
			}else {
				velocidadeAtual += delta;				
			}
		}
		void frear(){
			if(velocidadeAtual  >= 5) {
				velocidadeAtual -= 5;
			}else{
				velocidadeAtual = 0;
			}
		}
		
		public String toString(){
			return "Velocidade atual e " + velocidadeAtual + "km/h";
		}

}
