package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Monstro j1 =  new Monstro();
		j1.x = 10;
		j1.y = 10;
		
		Heroi j2 =  new Heroi();
		j2.x = 10;
		j2.y = 11;
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		j1.atacar(j2);
		System.out.println("houve um ataque");
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		j2.atacar(j1);//j2 ua a função atacar e usa j1 como parametro, quando a função é executada na outra classe, j2 é setado como oponente;
		System.out.println("houve um ataque");
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}
}
