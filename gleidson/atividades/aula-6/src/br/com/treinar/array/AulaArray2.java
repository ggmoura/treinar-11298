package br.com.treinar.array;

public class AulaArray2 {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[3];
		pessoas[0] = new Pessoa();
		pessoas[0].setNome("Marta Silva");
		
		Pessoa t = new Pessoa();
		t.setNome("Maria Sophia");
		
		pessoas[1] = t;
		
		pessoas[2] = new Pessoa();
		pessoas[2].setNome("Ana Cecília");
		
	}
	
}
