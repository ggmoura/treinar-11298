package br.com.treinar.modificador;

public class UsaModificador {

	public static void main(String[] args) {
		TesteModificadorAcesso modificador = new TesteModificadorAcesso();
		//Modificador privado so pode ser acessado dentro da propria classe
		//System.out.println(modificador.modificadorPrivado);
		
		System.out.println(modificador.modificadorDefault);
		System.out.println(modificador.modificadorProtected);
		System.out.println(modificador.modificadorPublico);
	}
	
}
