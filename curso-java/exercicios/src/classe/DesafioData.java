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
		final String formato = "%d/%d/%d";
		return String.format(formato, dia , mes , ano );//como aqui não há conflito, this. não se faz necessário;
	}
	
	//minha resposta (igual a do professor)
	DesafioData(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);//this como metodo; só pode se usar dentro de outro construtor;
	}
	DesafioData(int dia, int mes, int ano){//this. muito bom para usar com conflito de nomes;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
