package oo.composicao;

public class Motor {
	
	//relação bidirecional 
	final Carro carro;//= new Carro();//Relação bidirecional -> não aconselhavél 
	//relação bidirecional 
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	
	//relação bidirecional 
	Motor(Carro carro){//construção do motor precisa receber um carro como parametro;
		this.carro = carro;
	}
	//relação bidirecional 
	
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
		}
		
	}
}
