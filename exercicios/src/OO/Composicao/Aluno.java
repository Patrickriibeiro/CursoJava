package OO.Composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
  final String nome;
  final List <Curso> cursos = new ArrayList<>();
  
  Aluno(String nome){
	  this.nome = nome;
  }
  void adicionarCurso(Curso curso){
	  this.cursos.add(curso);
	  curso.alunos.add(this);
  }
  
  Curso obterCursoPorNome(String nome) {
	  Curso procurado = null;
	  
	  for(Curso curso : this.cursos) {
		  
		  if(curso.nome.equalsIgnoreCase(nome));{
			  return curso;
		  }
	  }
	  
	  
	  
	  return procurado;
  }
  
  public String toString() {
	  return nome;
  }
}
