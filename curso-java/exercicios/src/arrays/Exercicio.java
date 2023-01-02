package arrays;

import java.util.Arrays;//importação da classe Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];//criando array;
		//double notasAlunoA[] = new double[3];//versão alternativa
		
		System.out.println(Arrays.toString(notasAlunoA));//inicializando vazia;
		notasAlunoA[0]=7.9;
		notasAlunoA[1]=8;
		notasAlunoA[2]=6.7;
		notasAlunoA[3]=9.7;
//		System.out.println(notasAlunoA);//gera um valor estranho;
		
		System.out.println(Arrays.toString(notasAlunoA));//classe Arrays, e usando o metodo .toString() presente nela;
		//retorno [7.9, 8.0, 6.7];
		
		double totalAlunoA = 0;
//		for(int i = 0; i < 3; i++) {
//			total += notasAlunoA[i];
//		}
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
//		System.out.println(total  / 3);
		System.out.println(totalAlunoA  / notasAlunoA.length);
		
		double notaArmazenada = 5.9;
		double totalAlunoB =0;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};//valores literais para um array;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB  / notasAlunoB.length);
		
		//acessar array
		System.out.println(notasAlunoA[0]);//nota no indice zero;
		System.out.println(notasAlunoA.length - 1);//acesso ao ultimo indice do array;
		//System.out.println(notasAlunoA[4]);//gera erro pois o indice está fora dos limites;
		
		
		
	}

}
