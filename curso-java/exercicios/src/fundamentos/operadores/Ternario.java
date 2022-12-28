package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.1;
		String resultadoParcial = media >= 5.0 ? "em Recuperacao" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial ; // condiional
		System.out.println("O aluno esta " + resultadoFinal);
	
		double nota = 8;
		boolean bomComportamento = !false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto? "Sim." : "Nao.";		
		System.out.printf("Tem desconto? %s", resultado);
		
	}
}
