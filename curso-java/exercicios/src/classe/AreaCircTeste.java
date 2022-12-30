package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		//AreaCirc.PI = 3.1415; //acessando pi que está lá na classe; cuidado ao posicionar esse acesso pode ser que nem todos possam ver, e acabam não sobrendo alteração;
		AreaCirc a1 = new AreaCirc(10);
//		a1.pi=10;
		System.out.println(a1.area());//metodo que pertence a instancia
		//usando a mesma classe com valores diferentes, pois tem alocações de memoria diferentes a1 e a2;
		AreaCirc a2 = new AreaCirc(5);
//		a2.pi=5;
		System.out.println(a2.area());
		
		System.out.println(AreaCirc.area(100));//metodo static, pertence a classe;
		System.out.println(Math.PI);//PI versão nativa do JAVA;
		
	}
}
