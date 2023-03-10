package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro();//um carro para ser manipulado, com acesso aos atributos e metodos da Classe Carro, que por sua vez tem acesso a Classe Motor
		System.out.println(c1.estaLigado());
		c1.ligar();//chamando metodo ligar da Classe Carro;
		System.out.println(c1.estaLigado());
		System.out.println(c1.motor.giros());
		
		c1.acelerar();//chamando metodo acelerar da Classe Carro;
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();//chamando metodo frear da Classe Carro;
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		//System.out.println(c1.motor.carro.motor.carro.motor.giros());//encadeamento disponibilizada pela relação bidirecional;
		
		//faltou encapsulamento
		//c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());//através de c1 acessa Classe Carro, que tem acesso a Classe Motor, e traz o giro padrão do motor;
		
		c1.desligar();//chamando metodo desligar da Classe Carro;	
		System.out.println(c1.motor.giros());
	}

}
