package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();		
		//List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Anderson"); // exemplo de inserção
		lista.add(u1);
		
		lista.add(new Usuario("Gisele"));//outro exemplo de inserção
		lista.add(new Usuario("Isabel"));
		lista.add(new Usuario("Andrey"));
		lista.add(new Usuario("Teresinha"));
		lista.add(new Usuario("Edson"));
		
//		System.out.println(lista.get(3).nome);//pegar um dos dados listados; acesso peloindice;
		System.out.println(lista.get(3));//Usando toString() na clase usuario;
		
		//lista.remove(1);//removendo via index;
		System.out.println(" removido >>>" + lista.remove(1));
		//lista.remove(new Usuario("Teresinha"));
		System.out.println(" removido >>>" + lista.remove(new Usuario("Teresinha")));
		
		System.out.println(" tem?" + lista.contains(new Usuario("Andrey")));
		System.out.println(" tem?" + lista.contains(new Usuario("Teresinha")));
		
		
		for (Usuario u: lista) {
//			System.out.println(u.nome);
			System.out.println(u);
		}
		
	}
}
