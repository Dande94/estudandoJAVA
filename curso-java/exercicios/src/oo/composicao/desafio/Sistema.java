package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
//minha resposta incompleta
//		Cliente c1 = new Cliente("Anderson Nunes");		
//		System.out.println(c1);
//		System.out.println(c1.compras);
		
//resposta do professor
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88),2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 998.90),1);
		
		Cliente cliente = new Cliente ("Anderson Nunes");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		
		System.out.println(cliente.obterValorTotal());
	}
}
