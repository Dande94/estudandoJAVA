package oo.encapsulamento.casaA;

public class Ana {
	@SuppressWarnings("unused")//suprimindo a advertência gerada pelo private
	private String segredo = "...";//privado;
	String facoDentroDeCasa = "...";//default ou pacote;
	protected String formaDeFalar  = "...";//trasmissivel por herança;
	public String todosSabem = "...";//todos pode ver;
}
