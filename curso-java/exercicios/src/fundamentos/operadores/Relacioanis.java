package fundamentos.operadores;

public class Relacioanis {
	public static void main(String[] args) {
		System.out.println(3 > 4 );
		System.out.println(3 >= 3 );
		System.out.println(3 < 7 );
		System.out.println(3 > 4 );
		System.out.println(30 <= 7 );
		System.out.println(30 != 7 );
		System.out.println("______________________________________");
		
		double nota = 6.9;
		boolean bomComportamento = !false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem dsconto? " + temDesconto);
	}
}
