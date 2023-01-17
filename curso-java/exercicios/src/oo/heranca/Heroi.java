package oo.heranca;

public class Heroi extends Jogador{
	//transmissão de atributos e comportamentos vinda da classe Jogador;
	
	boolean atacar(Jogador oponente) {
		
		//sobrescrever;
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		if(deltaX == 0 && deltaY == 1) {//verifica se estão um ao lado do outro, heroi e monstro
//			oponente.vida -= 10;
//			return true;
//		}else if(deltaX == 1 && deltaY == 0) {//verifica se estão um ao lado do outro, heroi e monstro
//			oponente.vida -= 10;			
//			return true;
//		}else {
//			return false;
//		}
		
		
		
		boolean ataque1 = super.atacar(oponente);//super. -> reutilizar u metodo da superclasse(classe pai);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
	}
}
