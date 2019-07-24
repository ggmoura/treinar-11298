package br.com.treinar.aula;

public class TesteStatic {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		EstudoStatic o1 = new EstudoStatic();

		EstudoStatic.atributoStatico = 10;

		o1.atributoDeInstancia = 1;
		
		EstudoStatic o2 = new EstudoStatic();
		o2.atributoDeInstancia = 2;
		
		EstudoStatic o3 = new EstudoStatic();
		o3.atributoDeInstancia = 3;
		
		
		System.out.println(o1.atributoDeInstancia);
		System.out.println(o1.atributoStatico);
		
		System.out.println(o2.atributoDeInstancia);
		System.out.println(o2.atributoStatico);
		
		//Melhor acessar um atributo statico a partir da classe
		o2.atributoStatico = 22;
		
		System.out.println(o3.atributoDeInstancia);
		System.out.println(o3.atributoStatico);
	}
	
}
