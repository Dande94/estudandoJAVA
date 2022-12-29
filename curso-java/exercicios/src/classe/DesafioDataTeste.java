package classe;

public class DesafioDataTeste {
	public static void main(String[] args) {
		DesafioData d1 = new DesafioData();
		var d2 = new DesafioData();
		
		d1.dia = 28;
		d1.mes = 6;
		d1.ano = 1994;
		
		d2.dia = 13;
		d2.mes = 3;
		d2.ano = 1998;
		
		//minha resposta:
		String dataFormatada =d1.obterDataFormatada();
		System.out.println("Anderson: " + dataFormatada);
		//resposta do professor
		String dataFormatada2 =d2.obterDataFormatada2();
		System.out.printf("Gisele: "+ dataFormatada2);
		
		
		
		
		
	}

}
