package fundamentos;

//import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);		
		//byte
		Byte b = 100;
		//short
		Short s = 1000;
		//Integer
		//Integer i = Integer.parseInt(entrada.next());
		Integer i = 1000;
		//Long
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		
		//Reais
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		//boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		Boolean boo = Boolean.parseBoolean("true");
		System.out.println(boo.toString().toUpperCase());
		
		//Character
		Character c = '#';
		System.out.println("c"+c);
		
	}

}
