package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
//		Set<String> listaAprovados =  new HashSet<>();//collectios apenas de String;
		SortedSet<String> listaAprovados =  new TreeSet<>();//respeita a ordem de adição;
		//lista.add(1.2);//error;
		//lista.add("1.2");
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums =  new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (Integer n : nums) {
			System.out.println(n);			
		}
		
		}
	}
