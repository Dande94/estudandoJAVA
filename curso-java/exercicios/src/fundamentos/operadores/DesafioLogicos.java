package fundamentos.operadores;

public class DesafioLogicos {
		public static void main(String[] args) {
//minha resposta
			//Trabalho na terça (V ou F);
			//Trabalho na quinta (V ou F);
			//se vender os dois trabalho compra a tv DE  50pol
			//se vender só um dos trabalhos compra uma TV de 32pol
			//e se forem ao shopping compra a tv tomram sorvete
			boolean trabTerca = !true;
			boolean trabQuinta = !true;
			System.out.println("Comprou a TV 50pl:");
			System.out.println(trabTerca && trabQuinta);
			System.out.println("______________________________________");
			System.out.println("Comprou a TV 32pol:");
			System.out.println(trabTerca ^ trabQuinta);
			System.out.println("______________________________________");
			System.out.println("Vendeu pelo menos 1 projeto entao fomos ao shopping tomar sorvete:");
			System.out.println(trabTerca || trabQuinta);
			System.out.println("______________________________________");
			System.out.println("A vendas dos trabalhos nao deu certo e ficamos em casa:");
			System.out.println(!trabTerca && !trabQuinta);
			
			
			
			System.out.println("______________________________________");
			System.out.println("______________________________________");
			System.out.println("______________________________________");
			
//resposta do professor
			boolean trab1 = true;
			boolean trab2 = false;
	
			boolean comprouTV50 = trab1 && trab2;
			boolean comprouTV32 = trab1 ^ trab2;
			boolean comprouSorvete = trab1 || trab2;
			boolean maisSaudavel = !comprouSorvete; //operador Uninário;
			//"   \" " -> contra-barra mas aspa (escape) é uma forma de usar aspas dentro de uma string;
			System.out.println("Comprou TV50\"?" + comprouTV50);
			System.out.println("______________________________________");
			System.out.println("Comprou TV32\"?" + comprouTV32);
			System.out.println("______________________________________");
			System.out.println("Comprou Sorvete\"?" + comprouSorvete);
			System.out.println("______________________________________");
			System.out.println("Mais saudavel?" + maisSaudavel);
			
			
			
	}
	
	
	
	

}
