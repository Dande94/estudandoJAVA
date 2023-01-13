package oo.composicao.desafio;

public class Item {
//minha resposta incompleta
//	Produto p1 = new Produto(1.98, "Caneta");
//	Produto p2 = new Produto(7.85, "Grampeador");
//	Produto p3 = new Produto(5.91, "Post It");
//	Produto p4 = new Produto(4.47, "Folhas");
//	Produto p5 = new Produto(2.36, "Clips");
//	Produto p6 = new Produto(6.52, "Marca Texto");
//	int quantidade;	
//	Item(int quantidade){
//		this.quantidade = quantidade;
//	}
	
//resposta do professor	
	final Produto produto;
	final int quantidade;	
	
	Item(Produto produto, int quantidade){//constrututor do item, recebe um produto que é uma classe com 2 atributos, e quantodade que atributo da classe atual
		this.produto = produto;
		this.quantidade = quantidade;
	}

}
