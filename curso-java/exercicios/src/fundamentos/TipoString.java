package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(5));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		//casos de inferencia
		var nome = "Anderson";
		var sobrenome = "Nunes";
		var idade = 28;
		var salario = 12345.789F;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade:" + idade + "\nSalario:" + salario + "\n\n");
		//mesmo exemplo mas agora usando um metodo parecido com template string
		System.out.printf("Nome: %s %s tem %d anos e recebe %f de salario.\n", nome, sobrenome,idade,salario);
		System.out.printf("Nome: %s %s tem %d anos e recebe %.2f de salario.\n", nome, sobrenome,idade,salario);
		
		//Passando por .format
		String frase = String.format("Nome: %s %s tem %d anos e recebe %.2f de salario.\n\n", nome, sobrenome,idade,salario);
		System.out.println(frase);
		System.out.println(frase.contains("anos"));
		System.out.println(frase.indexOf("salario"));
		System.out.println(frase.substring(28));
		System.out.println(frase.substring(28 , 54));
		
		
	}

}
