package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		//nesse exemplo é pra criar um loop onde só pode sair do while se escrever a palavra sair!!
		
//minha tentativa
		Scanner entrada = new Scanner(System.in);
		boolean verificador = true;
		while(verificador) {
			String texto = entrada.next();
			System.out.println("Voce Diz:");
			if(texto.equalsIgnoreCase("sair")) {
				verificador = false;
			}
		}
		entrada.close();
		
//versão professor:
		Scanner entrada2 = new Scanner(System.in);
		String valor ="";		
		while(!valor.equalsIgnoreCase("sair")) {
				System.out.println("Voce Diz:");
				valor = entrada2.nextLine();
			}
		entrada2.close();
		
	}

}
