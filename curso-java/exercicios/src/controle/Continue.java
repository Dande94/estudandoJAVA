package controle;

public class Continue {
	//interrompe 1 faixa do loop e vai pra próxima
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
				//onde for impar não será impresso;
			}
			System.out.println(i);
		}
		System.out.println("________________________");
		for(int i = 0; i < 10; i++) {
			//if simplificado;
			if(i == 5)continue; //pulará o loop a faixa do loop quando 'i' for igual a 5 e indo 4 para o 6
			System.out.println(i);
		}
		System.out.println("fim");
	}
}
