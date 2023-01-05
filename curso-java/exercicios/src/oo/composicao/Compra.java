package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	
	ArrayList<Item> itens = new ArrayList<>();//Esse Array só pode receber dados do Tipo Item;Uma compra tem muitos itens e um item tem uma compra;
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
}
