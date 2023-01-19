package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Anderson", "Nunes" , 28);
		//p1.idade = -30;//alterar
//		p1.setIdade(55);
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
//		System.out.println(p1.getIdade());

		
	}
}
