package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; //conversão implicita
		System.out.println(a);
		
		
		//float b = 1.0F;
		//versão CAST
		float b = (float) 1.123456788888;//(conversão explicita) por ter execesso de numeros o float não suporta e trunca o valor ->1.1234568; o double suporta mais facilmente
		double c = 1.123456788888;
		
		System.out.println(b);
		System.out.println(c);
		int d = 4;
//		byte e = c;
		byte e = (byte)  d; // conversão explícita
		//o java não analisa tamanho, analise tipo, então por mais que o valor caibá tanto no int quanto byte expressará erro
		System.out.println(d);
		System.out.println(e);
		//truncando na conversão, por execeder o tamanho do byte de capacidade, ele volta pro inicio da capacidade de armazenamento;
		int f = 128;
		byte g = (byte)  f;
		System.out.println(g);
		
		// forçando a barra
		double h = 1;
//		double h = 1,999999; // trunca a conversão
		int i = (int) h;
		System.out.println(i);
		
		
		
	}
}
