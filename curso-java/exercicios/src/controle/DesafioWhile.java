package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
//minha resposta		
//		Scanner entrada = new Scanner(System.in);
//		double nota = 0;
//		int total = 0;
//		while(nota == -1 ) {			
//			nota = entrada.nextDouble();
//			if(nota < 0 || nota > 10){
//				System.out.println("Nota Invalida");
//			}else {
//				total++;
//				double acumuladoNotas;
//				acumuladoNotas = acumuladoNotas + nota;
//				System.out.println(acumuladoNotas);
//				System.out.println(total);
//			}			
//		}
//		double media = acumuladoNotas / total;
//		System.out.printf("A media é %.1f" , media);
//		//	Falhei, não consegui resolver
//		entrada.close();
//respota do professor
		
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		while(nota != -1) {
			System.out.print("Informe a nota(ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >=0) {
				total += nota;
				quantidadeDeNotas++;
			} else if(nota != -1) {
				System.out.println("Nota invalida!! ;D");
			}
		}
		//calcular media
		double media = total / quantidadeDeNotas;
		System.out.println("Media = " + media);
		entrada.close();

		
		
		
		
	}
	
}
