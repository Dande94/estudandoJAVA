package controle;

public class DesafioFor {
	public static void main(String[] args) {
		//desaio trata-se de controle o laço sem usar valor númerico;
//minha resposta
		String valor = "#";
		int ctrl = 5;
		int i= 1;
		for(; i <= ctrl ; i++) {
			System.out.println(valor);
			valor += "#";
		}
//respost professor
		for (String v = "#"; !v.equals("######"); v+= "#" ) {
			System.out.println(v);
		}
	}
	//não sabia que podia controlar laço de repetição usando string como condicional;
	//falhei no desafio porém aprendi muito sobre o for;
	//abriu a mente!!
}
