package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })//para calar a advertencias;
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);//double -> Double
		conjunto.add(true);//boolean -> Boolean
		conjunto.add("Teste");//String
		conjunto.add(1);//int -> Integer
		conjunto.add('x');// char -> caracter
		
		System.out.println("tamanho: " + conjunto.size());
		
		conjunto.add("teste");//por ter a a primeira letra minuscula não o torna igual ao outro;
		conjunto.add("Teste");//aceitará a repetição
		conjunto.add('x');//aceitará a repetição
		System.out.println("tamanho: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));//se não existir no conjunto retornará falso
		System.out.println("tamanho: " + conjunto.size());
		
		System.out.println(conjunto.contains("X"));//verificando se há no conjunto -> false
		System.out.println(conjunto.contains(true));//verificando se há no conjunto -> true
		System.out.println(conjunto);//valores do conjunto;
		
		System.out.println("_________________________________");
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);//valores do nums;
		//conjunto.addAll(nums);//união de nums ao conjunto;
		System.out.println(conjunto);//novos valores do conjunto;
		conjunto.retainAll(nums);//intersecção entre conjunto e nums; será apenas presenvador o valor em comum entre os dois
		System.out.println(conjunto);//novos valores do conjunto pós intersecção; mas para isso acontecer .addAll() não pode ter sido usado;
		conjunto.clear();
		System.out.println(conjunto);//esvaziando o conjunto;
		
		
		
		
		
		
		
	}
}
