package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

			System.out.print("Quantos Alunos:");
			int qtdeAlunos = entrada.nextInt();
			System.out.print("Quantas Notas:");
			int qtdeNotas = entrada.nextInt();
			
			double[][] notasDaTurma =new double [qtdeAlunos] [qtdeNotas];//construção da matriz
			
			double total = 0;
			
			for (int a = 0; a < notasDaTurma.length; a++) {//acessando loop no array qtdeAlunos
				for (int n = 0; n < notasDaTurma[a].length; n++) { //acessando loop no array qtdeNotas
					System.out.printf("Informe a nota %d do aluno %d:" , (n + 1), (a + 1));
					notasDaTurma[a][n] = entrada.nextDouble();//usando colchestes duplos para referencia de posição da array externo e interno;
					total += notasDaTurma[a][n]; 
				}
			}
			
			double media = total / (qtdeAlunos * qtdeNotas);
			System.out.printf("Media da turma e %.2f" , media);
			
			System.out.println();
			
			for(double[] notasDoAluno: notasDaTurma) {//nesse foreach, ele irá retornar arrays de double presente no array notasDaTurma[];
				System.out.println("Notas do aluno: -> " + Arrays.toString(notasDoAluno));//cada aluno será um array que retonará seu array interno;
				//retorno
				//[7.0, 7.0, 7.0] -> aluno 1
				//[8.0, 8.0, 8.0] -> aluno 2
				//[9.0, 9.0, 9.0] -> aluno 3
			}
			

		entrada.close();

	}
}
