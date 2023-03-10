package classe;

import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@zmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@zmail.com";
		
		System.out.println(u1 == u2);//retornará false pois está procurando igualdade no espaço de memoria, esses espaços não são iguais;
		System.out.println(u1.equals(u2));//retornará false pois está procurando igualdade no espaço de memoria, esses espaços não são iguais;
		System.out.println(u2.equals(u1));//retornará false pois está procurando igualdade no espaço de memoria, esses espaços não são iguais;
		
		System.out.println(u2.equals(new Date()));//testanto a robuste da lógica procura;
		
	}
}
