package controle;

public class DesafioIf {
	public static void main(String[] args) {
		double nota = 1.3;
		
		//Pq o if não está executando corretamente;
		if(nota >= 9.0); {
			System.out.println("Quadro de Honra");
			System.out.println("Você é fera");
		}
		//minha resposta: por causa do ';' depois do parenteses do if
		//a IDE entende que o bloco acabou ali e executa as linha na sequencia;
		
		//Respota do professor: igual a minha;
	}

}
