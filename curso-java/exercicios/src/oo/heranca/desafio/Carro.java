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
//resposta do professor
//		void acelerar(){
//			velocidadeAtual += 5;
//		}
//		void frear(){
//		if(velocidadeAtual > >= 5) {
//			velocidadeAtual -= 5;
//		}else{
//			velocidadeAtual = 0
//		}
//		
//		public String toString(){
//			return "Velocidade atual é" + velocidadeAtual + "km/h";
//		}
//	}

}
