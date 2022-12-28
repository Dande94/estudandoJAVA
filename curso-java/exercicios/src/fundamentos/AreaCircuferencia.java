package fundamentos;

public class AreaCircuferencia {
	public static void main(String[] args) {
//		System.out.println(2 + 3);
		double raio = 3.4;// ao declarar uma variavel primeiro o tipo, depois o nme e depis o valor qur irá receber;
		final double PI = 3.14159;//ao acrencetar 'final' a variavel se torna constante; 
		
		double area = PI * raio * raio;
		
		System.out.println("Area: " + area + "m²");
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area: " + area + "m²");
	}

}
