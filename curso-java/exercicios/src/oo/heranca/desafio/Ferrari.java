package oo.heranca.desafio;

public class Ferrari extends Carro{

//	boolean acelerar(){
//		velocidadeAtual += 15;
//		return true;
		
//
//		boolean acelerar1 = super.acelerar();
//		boolean acelerar2 = super.acelerar();
//		boolean acelerar3 = super.acelerar();
//		return acelerar1 || acelerar2 || acelerar3;
	
//resposta do professor e  minha resposta
	public Ferrari(){
		super(315);
	}
	public Ferrari(int velocidadeMaxima){//setando velocidade máxima enviada por parametro
		super(velocidadeMaxima);
		delta =15;
	}
	
//		void acelerar() {
//			velocidadeAtual += 15; //ou super.acelerar();
//		}
//	}
}
