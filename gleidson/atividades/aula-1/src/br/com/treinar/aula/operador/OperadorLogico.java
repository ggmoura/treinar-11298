package br.com.treinar.aula.operador;

public class OperadorLogico {

	public static void main(String[] args) {
		boolean ehMaiorDeIdade = false;
		boolean possuiIngresso = true;
		boolean ehConvidado = false;
		
		System.out.println(ehMaiorDeIdade && possuiIngresso);
		System.out.println(ehMaiorDeIdade || ehConvidado);
		
		System.out.println("Menor de 18 não pode beber alcool: " + !ehConvidado);
		
		
	}

}
