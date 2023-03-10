package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String nome;
	final List<Curso> cursos = new ArrayList<>();//acesso a Classe Curso;
	//incluindo o 'final' ele trava o endereço de memoria do array, impedindo posteriormente que o mesmo seja redirecionado;
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso){
		//Relação bidirecional	
		this.cursos.add(curso);
		curso.alunos.add(this);	
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {
		return nome;
	}
	
}
