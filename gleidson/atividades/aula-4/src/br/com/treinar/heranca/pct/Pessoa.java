package br.com.treinar.heranca.pct;

public abstract class Pessoa {

	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void respirar() {
		System.out.println("Eu sou ".concat("X").concat(", estou respirando"));
	}
	
}
