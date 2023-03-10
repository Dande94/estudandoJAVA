package colecoes;

import java.util.HashMap;
import java.util.Map.Entry;


public class Map {
	public static void main(String[] args) {
//		java.util.Map<Integer, String> usuarios = new HashMap<Integer, String>();
		java.util.Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Anderson");//inserção no Map;
		//usuarios.put(1, "Andrey");//caso repita, ele não irá incluir e sim substituir;
		usuarios.put(2, "Andrey");
		usuarios.put(3, "Gisele");
		usuarios.put(4, "Isabel");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		
		System.out.println(usuarios.keySet());//retorna as chaves;
		System.out.println(usuarios.values());//retorna os valores;
		System.out.println(usuarios.entrySet());//retorna as chaves com os valores;
		
		System.out.println(usuarios.containsKey(3));//retorna um boolean;
		System.out.println(usuarios.containsValue("Anderson"));//retorna um boolean;
		
		System.out.println(usuarios.get(2));//traz o valor a partir da chave;
		System.out.println(usuarios.remove(1));//remover a partir da chave
		System.out.println(usuarios.remove(4 ,"Teresinha"));//remover por chave e valor, caso não seja verdadeira a combinação retornaraá false;
		
		for (int chave : usuarios.keySet()) {//trazer o valor da chave
			System.out.print(chave + " ");			
		}
		System.out.println();
		
		for (String valor : usuarios.values()) {//trazer o valor
			System.out.print(valor + " ");			
		}		
		System.out.println();
		
		//foreach para percorrer os dois registros;
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " >>> ");
			System.out.println(registro.getValue());
		}
		
		
	}
}
