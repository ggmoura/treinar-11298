package br.com.treinar.heranca;

import br.com.treinar.heranca.pct.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Homem h = new Homem();
		h.setNome("Gleidson");
		h.respirar();
		
		
		Mulher m = new Mulher();
		m.setNome("Maria Sophia");
		m.respirar();
		// classe pessoa eh abstrata nao pode ser instanciada
		// Pessoa generico = new Pessoa();
		// generico.respirar();
		
		Pessoa p = new Homem();
		p.respirar();
		
		Homem referenciaHomem = (Homem) p;
		referenciaHomem.setBarba("Barba");
		
		// br.com.treinar.heranca.Homem cannot be cast to br.com.treinar.heranca.Mulher
		// Mulher referenciaMulher = (Mulher) p;
		// referenciaMulher.setBrinco("Argola");
	}
	
}
