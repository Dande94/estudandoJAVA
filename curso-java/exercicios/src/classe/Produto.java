package classe;

public class Produto {
	
	String nome;
	double preco;
	static double DESCONTO = 0.25;// é double porque a variação dele será entre 0 e 1; 
	
	//ambos construtores pdem existir com mesmo nome pois as assinaturas são diferentes;
	
	Produto(){//construtor padrão
	}
	
	Produto(String nomeInicial , double precoInicial){//construtor explicito ,double descontoInicial
		nome = nomeInicial;
		preco = precoInicial;
//		desconto = descontoInicial;
	}
	
	double precoComDesconto(){//como os parametros estão dentro da mesma classe não precisa setar no argumento;
		
		return (preco * (1 - DESCONTO));	
	}

}
