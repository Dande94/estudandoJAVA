package oo.heranca.desafio;

public class Ferrari extends Carro{
	boolean acelerar(){
//		velocidadeAtual += 15;
//		return true;
		

		boolean acelerar1 = super.acelerar();
		boolean acelerar2 = super.acelerar();
		boolean acelerar3 = super.acelerar();
		return acelerar1 || acelerar2 || acelerar3;
		
	}
}