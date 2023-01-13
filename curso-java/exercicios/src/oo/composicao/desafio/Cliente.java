package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
//minha resposta incompleta
//	String nome;
//	final ArrayList<Compra> compras = new ArrayList<>();	
//	Cliente(String nome){
//		this.nome = nome;
//	}
//	public String toString() {
//		return nome;
//	}
//resposta do professor
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();//1 cliente tem muitas compras
	
	Cliente(String nome){
		this.nome = nome;
	}
	public String toString() {
		return nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {//valor de total de todas as compras;
		double total = 0;
		
		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
	
}
