package br.com.treinar.aula.oo;

public class Principal {

	public static void main(String[] args) {
		Pessoa aluno;
		System.out.println("alguma coisa acontece");
		aluno = new Pessoa();
		aluno.idade = 38;
		System.out.println(aluno.idade);
		
		Pessoa professor = new Pessoa();
		professor.altura = 186;
		System.out.println(professor.altura);
		
		
		Pessoa clone = aluno;
		
		System.out.println("Idade do clone: " + clone.idade);
		
		clone.idade = 27;
		
		System.out.println("Idade do aluno: " + aluno.idade);
		clone = new Pessoa();
		clone.idade = 19;
		
		System.out.println("Idade do aluno: " + aluno.idade);
		
		
		aluno = null;
		
		System.out.println("blah blah blah...");
		
		
	}

}
