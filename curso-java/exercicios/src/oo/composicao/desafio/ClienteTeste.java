package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Anderson Nunes");
		
		cliente1.compras.add(1,1.98, "Caneta");
		
		System.out.println(cliente1);
	}
}