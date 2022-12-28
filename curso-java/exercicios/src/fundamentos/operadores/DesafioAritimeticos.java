package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
//		int a = 3  * 4 - 10;
//		int b = (int) Math.pow(a, 3);//como o retorno de Math.pow() é do tipo double fazendo o CAST convete pra inteiro;
//		double c = Math.pow(a, 3);
//		System.out.println(b);
//		System.out.println(c);

//Minha respostas:
		int A1= 6;
		int A2= (3 + 2);
		int A3= 3 * 2;
		int A = (int) (Math.pow(A1 * A2 , 2) / A3 );
		System.out.println(A);
		int B1 = 1 -5;
		int B2 = 2 - 7;
		int B3 = 2;
		int B = (int) Math.pow((B1 * B2) / B3, 2 );
		System.out.println(B);
		
		int C = (int) Math.pow(10, 3);
		
		int resultado = (int) (Math.pow(A - B, 3) / C);
		System.out.println("Resultado geral e: " + resultado);

//reposta do professor:
		double numA = Math.pow(6 * (3 + 2 ), 2);;
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB , 2);
		
		double superior = Math.pow(superiorA - superiorB , 3);
		double inferior = Math.pow(10, 3);
		
		double resultadoProfessor = superior / inferior;
		System.out.println("O resultado do professor é: " + resultadoProfessor);
		
		//o códgo do professor fico muito mais legivel por conta dos nomes escolhidos;
		//no meu código quebrei mais os problemas;
		
	}
}
