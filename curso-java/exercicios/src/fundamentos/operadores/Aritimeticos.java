package fundamentos.operadores;

public class Aritimeticos {
	public static void main(String[] args) {
		System.out.println(2 + 3);
		var x = 34.56;
		var y = 2.2;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // aplicando CAST para converte o resultado em double
		System.out.println(a / (float) b); // aplicando CAST para converte o resultado em float
		
		System.out.println(a % b);//sobra da divisão
		System.out.println(8 % 3);
		
		
		System.out.println(x + y - a * b);
	}

}
