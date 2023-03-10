package classe;

public class Usuario {
	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) {//definir os critérios de igualdade;
		//Object é a classe padrão dos objetos(como se fosse o Adão);
		if(objeto instanceof Usuario) {//instanceof verifica está verificando se o objeto passado é uma instancia de Usuario; ou seja o obejto não pode ser algo que ele não é tipo uma data;
			Usuario outro = (Usuario) objeto;//covertendo(cast) o objeto recebido para usuario;
			boolean nomeIgual = outro.nome.equals(this.nome);// está verificando se o conteudo de nome vindo da busca é igual instanciado em Usuario;
			boolean emailIgual = outro.email.equals(this.email);// mesma lógica mas aplicada a email;
			
			return nomeIgual && emailIgual;	// só irá retorna verdadeiro se ambos forem verdadeiros;
		}else {
			return false;
		}
		
		
	}
	//O hashcode será abordado em outra aula;
}
