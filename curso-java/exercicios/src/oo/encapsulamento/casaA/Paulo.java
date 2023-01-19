package oo.encapsulamento.casaA;

public class Paulo {
	Ana esposa =  new Ana();
	void testeAcessos() {
//		segredo
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		//System.out.println(esposa.segredo);//não tem acesso por ser exclusivo de Ana;
		System.out.println(esposa.facoDentroDeCasa);//tem aceso por ser do mesmo pacote
		System.out.println(esposa.formaDeFalar);//tem aceso por ser do mesmo pacote, para ser visto fora do pacote precisa ser herdado a Classe;
		System.out.println(esposa.todosSabem);//visivel a todos;
	}
}
