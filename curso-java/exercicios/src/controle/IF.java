package controle;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a media:");
		double media = entrada.nextDouble();
		
		if(media <=10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		};
		if(media <7 && media >= 4.5){
			System.out.println("Recuperção");						
		};
		
		boolean criterioRepovadocaoAtigindo = media < 4.5 && media >= 0; 
		
		if(criterioRepovadocaoAtigindo) {
			System.out.println("Reprovado");
			System.out.println("Parabéns");
		};
		entrada.close();
	}
}
