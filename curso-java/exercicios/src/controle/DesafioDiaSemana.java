package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
//minha resposta
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um dia da semana:");
		String dia = entrada.next();
		
		if(dia.equals("domingo")) {
			System.out.println(1);
		}else if(dia.equals("segunda")){
			System.out.println(2);			
		}else if(dia.equals("terça")){
			System.out.println(3);			
		}else if(dia.equals("quarta")){
			System.out.println(4);			
		}else if(dia.equals("quinta")) {
			System.out.println(5);			
		}else if(dia.equals("sexta")) {
			System.out.println(6);			
		}else if(dia.equals("sabado")) {
			System.out.println(7);			
		}
		
		
		entrada.close();
		
//resposta do professor:
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Informe um dia da semana:");
		String dia2 = entrada.next();
		
		if(dia2.equals("domingo")) {
			System.out.println(1);
		}else if(dia2.equalsIgnoreCase("segunda")){//estratégia diferente -> "segunda".contentEquals(dia2)
			System.out.println(2);			
		}else if(dia2.equalsIgnoreCase("terça")){
			System.out.println(3);			
		}else if(dia2.equalsIgnoreCase("quarta")){
			System.out.println(4);			
		}else if(dia2.equalsIgnoreCase("quinta")) {
			System.out.println(5);			
		}else if(dia2.equalsIgnoreCase("sexta")) {
			System.out.println(6);			
		}else if(dia2.equalsIgnoreCase("sabado")) {
			System.out.println(7);			
		}
		entrada2.close();
		
		//tanto a minha quanto a do professor geram o mesmo resultado, porém ele usou o .equalsIgnoreCase, que realemnte foi ua ótima dica!
	}
}
