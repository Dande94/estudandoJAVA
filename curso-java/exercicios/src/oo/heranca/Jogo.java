package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Monstro monstro =  new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi =  new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
		
		System.out.println("Monstro tem =>"+monstro.vida);
		System.out.println("Heroi tem =>"+heroi.vida);
		monstro.atacar(heroi);
		System.out.println("houve um ataque");
		System.out.println("Monstro tem =>"+monstro.vida);
		System.out.println("Heroi tem =>"+heroi.vida);
		heroi.atacar(monstro);//j2 ua a função atacar e usa j1 como parametro, quando a função é executada na outra classe, j2 é setado como oponente;
		System.out.println("houve um ataque");
		System.out.println("Monstro tem =>"+monstro.vida);
		System.out.println("Heroi tem =>"+heroi.vida);
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		System.out.println("houve um ataque");
		System.out.println("Monstro tem =>"+monstro.vida);
		System.out.println("Heroi tem =>"+heroi.vida);
	}
}
