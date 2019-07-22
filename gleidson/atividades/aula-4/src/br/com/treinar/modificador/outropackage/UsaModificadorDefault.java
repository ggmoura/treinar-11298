package br.com.treinar.modificador.outropackage;

import br.com.treinar.modificador.TesteModificadorAcesso;

public class UsaModificadorDefault {

	public static void main(String[] args) {
		TesteModificadorAcesso acesso = new TesteModificadorAcesso();
		
		// So pode ser acessado dentro da propria classe
		// System.out.println(acesso.modificadorPrivado);
		
		// So pode ser acessado dentro do mesmo pacote e nas classes que herdam
		// System.out.println(acesso.modificadorProtected);
		
		// So pode ser acessado dentro do mesmo pacote
		// System.out.println(acesso.modificadorDefault);
		
		// Acessado em qualquer ponto do codigo
		System.out.println(acesso.modificadorPublico);
	}
	
}
