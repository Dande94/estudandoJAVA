package classe;

public class DesafioDataTeste {
	public static void main(String[] args) {
		DesafioData d1 = new DesafioData();
		var d2 = new DesafioData();
		
		d1.dia = 28;
		d1.mes = "Junho";
		d1.ano = 1994;
		
		d2.dia = 13;
		d2.mes = "Março";
		d2.ano = 1998;
		
		System.out.printf("Anderson: %d / %s / %d \n", d1.dia , d1.mes , d1.ano );
		System.out.printf("Gisele: %d / %s / %d", d2.dia , d2.mes , d2.ano );
		
		
		
		
		
	}

}
