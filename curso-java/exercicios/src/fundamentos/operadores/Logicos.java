package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		System.out.println(condicao1 && condicao2);//AND
		System.out.println(condicao1 && !condicao2);//AND NOT
		System.out.println(condicao1 || condicao2);//OR
		System.out.println(condicao1  ^ condicao2);//XOR
		System.out.println(!condicao1);//NOT
		System.out.println(!!condicao1);//DoubleNOT
		System.out.println(!condicao2);//NOT
		System.out.println("______________________________________");
		
		//tabela verdade E
		System.out.println("Tabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("______________________________________");
		
		//tabela verdade OU
		System.out.println("Tabela verdade OU");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("______________________________________");
		
		//tabela verdade XOR
		System.out.println("Tabela verdade XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("______________________________________");
		
		//tabela verdade NOT
		System.out.println("Tabela verdade NOT");
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!false);
		System.out.println(!!false);
		
		
	}

}
