package fundamentos;

public class NotacaoPontos {
	public static void main(String[] args) {
		double a =2.3;
		String s = "Bom dia X ";
		//System.out.println(s);
		//System.out.println(s.toUpperCase());
		//s = s.toUpperCase();
		//System.out.println(s);
		
		//---------------------
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		//---------------------
		String y = "Bom dia X ".replace("X", "Anderson");
		System.out.println(y);
		
		//Tipos de primitivos não tem operador '.';
		//int a = 3;
		//a.
	}
}
