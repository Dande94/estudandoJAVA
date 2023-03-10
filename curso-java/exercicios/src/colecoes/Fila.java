package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		//.add() & .offer() -> maneiras de inserção para queue;
		fila.add("Ana");// caso falhe ela expressa erro na execução
		fila.offer("Bia");// caso falhe retorna false; 
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		//a diferença é o comportamento quando a fila está cheia;
		
		
		//.peek() & .element() -> obter o próximo elemento da fila(sem remover);
		System.out.println(fila.peek());//se estiver vazia retorna null;
		System.out.println(fila.peek());
		System.out.println(fila.element());//se estiver vazia lanã uma exception(exceção);
		System.out.println(fila.element());
		//a diferença é o comportamento quando a fila está vazia;
		
		//fila.size();//tamanho da fila;
		//fila.clear();//limpar a fila;
		//fila.isEmpty();//verificar se está vazia;
		//fila.contains();//verificar se contém na fila;
		
		//.poll() & .remove() -> obter e remover o primeiro elemento da fila 
		System.out.println(fila.poll());//retorna o primeiro elemento já removendo ele; caso a fila esteja vazia retorna null;
		//System.out.println(fila.remove());//retorna o primeiro elemento já removendo ele; caso a fila esteja vazia expressa erro(exception);
		//a diferença é o comportamento quando a fila está vazia;
	}
}
