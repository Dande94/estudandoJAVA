package controle;

public class Break {
	//quando o 'i' for igual a 5 ele seta o break em para o for(), assim mudando o comportamento padrão do for(); 
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("fim");
	}
}
