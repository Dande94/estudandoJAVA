package classe;

//import controle.Break;//importanção da classe Break

public class ProdutoTeste {
	public static void main(String[] args) {
		//Break //->Classe, usado apenas pra explicar a importação de classes, não afeta o exercício;
		
		//usando construtor padrão;
		Produto p1 = new Produto();// instanciando o Tipo Produto, a palavra new é construtora desse tipo;
		//acessando Produto através da notação '.';
		p1.nome = "Notebook";
		p1.preco = 4356.89;
//		p1.desconto = 0.25;
		
		//usando construtor explicito;
		var p2 = new Produto("Caneta Preta", 12.56);// a través do new Produto(), o JAVA já infere ao Tipo;
		//p2.nome = "Caneta Preta";
		//p2.preco = 12.56;
		Produto.DESCONTO = 0.29;

		// A Classe Produto criada no outro arquivo,aqui é usada como Tipo(como se fosse String,in e double, e atrvés da notação ponto acesso seus atributos(nome,preco e desconto));
		//p1 / p2 é como fica setado pra usar o tipo Produto, como se fosse a variaél que irá comporta o acesso à aquela Classe(Tipo); 
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();//refatorado pra pegar a formula da classe Produto
		double precoFinal2 = p2.preco * (1 - p2.DESCONTO);//metodo sem refatoração para comparação;
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		System.out.println(mediaCarrinho);
		
		
	}
	
}
