package classe;

public class DesafioData {
	int dia;
	int mes;
	int ano;
	
	//minha resposta
	String obterDataFormatada() {
		return (dia + "/"+ mes + "/"+ ano) ;
	}
	//resposta do professor
	String obterDataFormatada2() {
		return String.format("%d / %d / %d", dia , mes , ano ) ;
	}
}
