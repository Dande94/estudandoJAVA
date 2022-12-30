package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		//atribuição por valor(primitivo)
		double a  = 2;
		double b = a;
		a++;
		b--;
		System.out.println(a + " " + b);
		
		//atribuição por referencia(objeto)
		DesafioData d1 = new DesafioData(1, 6, 2022);
		DesafioData d2 = d1;
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	static void voltarDataParaValorPadrao(DesafioData d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
	

}
