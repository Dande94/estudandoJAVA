package classeDesafio;

public class Pessoa {
////minha resposta;
//	String nome = "Anderson Nunes";
//	double peso = 87.5;
//	
//	String comer(double pesoComida, String comida){
//		double novoPeso = this.peso + pesoComida;
//		return (this.nome + " comeu " + comida + " e passou de " + this.peso + "kg para " + novoPeso +"kg");
//		
//resposta do professor;
		String nomeProfessor;
		double pesoProfessor;
		Pessoa(String nomeProfessor, double pesoProfessor){
			this.nomeProfessor = nomeProfessor;
			this.pesoProfessor = pesoProfessor;
		}
		
		void comerProfessor(Comida comida) {
			if(comida != null) {
				this.pesoProfessor += comida.peso;
			}
		}
		
		String apresentar() {
			return "Ola eu sou o " + nomeProfessor +  " e tenho " + pesoProfessor + "kgs.";
		}
		
	}

