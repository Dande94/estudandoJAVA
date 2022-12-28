package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		//posfixada
		a++;//a = a + 1;
		a--;//a = a - 1;
		//prefixada
		++b;//b = b + 1;
		--b;//b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("MiniDesafio...");
		System.out.println(++a == b--);// deu verdadeiro pois 'a' foi incrementado antes da comparação , 'a' virou 2  e 'b' era 2 também quando comparou  e por isso deu verdadeiro, e só depois da comparação o 'b' decrementou virando 1;    
		
		System.out.println(a);
		System.out.println(b);
	}
}
