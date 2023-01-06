package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();//acesso a Classe Aluno;
	//incluindo o 'final' ele trava o endereço de memoria do array, impedindo posteriormente que o mesmo seja redirecionado;
	
	Curso(String nome){
		this.nome= nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		//Relação bidirecional
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
