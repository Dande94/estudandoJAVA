package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;// é double porque a variação dele será entre 0 e 1; 
	
	//ambos construtores pdem existir com mesmo nome pois as assinaturas são diferentes;
	
	Produto(){//construtor padrão
	}
	
	Produto(String nomeInicial , double precoInicial, double descontoInicial ){//construtor explicito
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto(){//como os parametros estão dentro da mesma classe não precisa setar no argumento;
		
		return (preco * (1 - desconto));	
	}

}
