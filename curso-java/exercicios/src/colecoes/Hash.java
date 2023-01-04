package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		usuarios.add(new Usuario("Anderson"));
		usuarios.add(new Usuario("Gisele"));
		usuarios.add(new Usuario("Isabel"));
		usuarios.add(new Usuario("Andrey"));
		
		boolean resultado = usuarios.contains(new Usuario("Andrey"));
		System.out.println(resultado);
	}
}
