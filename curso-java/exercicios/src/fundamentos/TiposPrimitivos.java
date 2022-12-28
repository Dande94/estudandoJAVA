package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//infomações de funcionario
		//tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542; 
		int id = 56789;
		long pontosAcumulados = 3_234_445_223L; //possível usar underline para organizar numeros grandes, adicinar  'L' ao final do nuemro para o JAVA entender que o numero é um literal long;
		
		//tipos numéricos reais
		float salario = 11_445.44F; //Para numéros reais há também um caso parecido, caso sete um valor doufle numa váriavel float, então ai final do numero adicionar 'F'
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo boolean
		boolean estaDeFerias = false; // ou true
		
		//tipo caracterer
		char status = 'A';//ativo
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": recebe -> " + salario);
		System.out.println("Ferias: " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
