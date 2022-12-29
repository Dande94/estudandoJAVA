package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;// é double porque a variação dele será entre 0 e 1; 
	
	double precoComDesconto(){//como os parametros estão dentro da mesma classe não precisa setar no argumento;
		
		return (preco * (1 - desconto));	
	}

}
