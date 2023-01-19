package oo.heranca;

public class Monstro extends Jogador{
	//transmissão de atributos e comportamentos vinda da classe Jogador;
	public Monstro(){
		this(0,0);
	}
	public Monstro(int x, int y){
		super(x,y);
	}
}
