package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");//true
		
		String s1 = new String ("2");
		System.out.println("2" == s1);//false
		System.out.println("2".equals(s1));//true -> comparador de conteudo;
		 
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		//.next() -> tira o espaços em branco (posteriormente talvez não precise do .trim()) e o .nextLine() -> não tira os espaço em branco
		System.out.println("2" == s2.trim());// -> eliminar espaços em  branco;
		System.out.println("2".equals(s2.trim()));
				
				
		entrada.close();
		
	}
}
