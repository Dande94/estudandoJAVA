package arrays;

import java.util.Scanner;

public class DesafioArray {
	//minha resposta;
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			System.out.print("Quantas notas voce quer informar:");
			int qtdNotas = entrada.nextInt();
			System.out.println();
			
			double[] notasAluno = new double[qtdNotas];
			
			for(int i = 0; i < notasAluno.length; i++) {
				System.out.print("qual e a " + (i + 1) + "(a) nota:" );
				notasAluno[i] = entrada.nextDouble();
			}
			System.out.println();
			double total = 0;
			for (double nota : notasAluno) {
				total += nota;
			}
			double media = total / notasAluno.length;
			
			System.out.printf("A media do aluno e %.2f ", media );
			
			
		entrada.close();
		
		
//resposta do professor
		
		//minha resposta ficou igual a do professor;
		
	}

}
