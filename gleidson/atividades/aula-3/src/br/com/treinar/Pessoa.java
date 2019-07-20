package br.com.treinar;

public class Pessoa {

	Integer idade;
	String nome;
	
	public Pessoa() {
		this(0);
	}
	
	public Pessoa(Integer idade) {
		this.idade = idade;
	}
	
	public Pessoa(String nome) {
		this(nome, 0);
		this.nome = nome;
	}
	
	public Pessoa(String nome, Integer idade) {
		this(idade);
		this.nome = nome;
	}
	
	
	
	
}
