package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		//minha respota:
		Scanner entrada = new Scanner(System.in);
				System.out.print("Informe o 1º salario:");
				String sal1 = entrada.nextLine();
				System.out.print("Informe o 2º salario:");
				String sal2 = entrada.nextLine();
				System.out.print("Informe o 3º salario:");
				String sal3 = entrada.nextLine();
				
//versão original
//				sal1 = sal1.replace(",", ".");
//				sal2 = sal2.replace(",", ".");
//				sal3 = sal3.replace(",", ".");
//				
//				double m1 = Double.parseDouble(sal1);
//				double m2 = Double.parseDouble(sal2);
//				double m3 = Double.parseDouble(sal3);
//Otimizado
				double m1 = Double.parseDouble(sal1.replace(",", "."));
				double m2 = Double.parseDouble(sal2.replace(",", "."));
				double m3 = Double.parseDouble(sal3.replace(",", "."));
				
				double media = (m1+m2+m3)/3;
				
				System.out.printf("A media de salario é: %f", media);
				
//resposta do professor:				
				Scanner entrada2 = new Scanner(System.in);
				System.out.print("Informe o 1º salario:");
				String valor1 = entrada2.next().replace(",", ".");
				
				System.out.print("Informe o 1º salario:");
				String valor2 = entrada2.next().replace(",", ".");
				
				System.out.print("Informe o 1º salario:");
				String valor3 = entrada2.next().replace(",", ".");
				
				double salario1 = Double.parseDouble(valor1);
				double salario2 = Double.parseDouble(valor2);
				double salario3 = Double.parseDouble(valor3);
				
				double media2 = (salario1 + salario2 + salario3)/3;
				
				System.out.println("A media dos salarios é: " + media2);
				
				entrada2.close();//esqueci de fechar o close
		
	}

}
