package controle;

import java.util.Iterator;

public class BreakRotulado {
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {  
				if(i == 1) {
					break;
				}
				System.out.printf("[%d %d] \n", i, j);
			}
		}
		System.out.println("Fim!");
		
		System.out.println("__________________________");
		externo: for (int i = 0; i < 3; i++) {
			interno: for (int j = 0; j < 3; j++) {  
				if(i == 1) {
					 break externo;
				}
				System.out.printf("[%d %d] \n", i, j);
				//se aplicar o rotulo interno o comportamente será o padrão(nesse caso) e externo muda completamente; 
			}
		}
		System.out.println("Fim!");
	}
}
