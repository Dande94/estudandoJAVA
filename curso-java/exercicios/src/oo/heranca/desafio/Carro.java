package oo.heranca.desafio;

public class Carro {
	public final int VELOCIDE_MAXIMA;
	protected int velocidadeAtual = 0;
	protected int velocidadeMinima = 0;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima){
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
		public void acelerar(){
			if(velocidadeAtual + delta > VELOCIDE_MAXIMA) {
				velocidadeAtual = VELOCIDE_MAXIMA;
			}else {
				velocidadeAtual += delta;				
			}
		}
		public void frear(){
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
