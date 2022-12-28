package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "preta";
		//não recebe valor booleano, apenas um alor direto;
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
		default:
			System.out.println("Estou em apredizagem");			
		}
		System.out.println("Fim");			
		//o problema de não usar o break, é que quado encontrar um case que satisfaça a condição oswitc executa todos os cases abaixo
		//para algo acumulativo a ideia funciona, mas para uma seleção única não;
	}
}
