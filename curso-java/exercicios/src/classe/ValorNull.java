package classe;

public class ValorNull {
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!!!!"));
		String s2 = null;
		if(s2 != null) {
			System.out.println(s2.concat("??????"));//Não se pode acessar atributo e metodo de algo que está nulo;
			//pq é algo que não aponta para um objeto real na memoria;	
		}
	}
}
