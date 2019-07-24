package br.com.treinar.aula;

public class EstudoStatic {

	public EstudoStatic() {
		System.out.println("construtor default");
	}
	
	static {
		atributoStatico = 0;
	}
	
	static {
		System.out.println("fez o primeiro static");
	}
	
	public static Integer atributoStatico;
	public Integer atributoDeInstancia;

}
