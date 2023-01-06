package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	final ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
}
