package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Codigo Limpo");
		livros.push("Fortaleza Digital");
		livros.push("Saga Eragon");
		
//		System.out.println(livros.peek());
//		System.out.println(livros.element());
//		
//		System.out.println(livros.pop());
//		System.out.println(livros.poll());
//		System.out.println(livros.remove());
		
		//básicamente os mesmo métodos do Fila porém se baseando no ultimo elemento da lista;
		// offer -> push (pata inserção) / inclusão dp pop() (para exclusão);
		
		for (String livro : livros) {
			System.out.println(livro);
		}
	}
}
