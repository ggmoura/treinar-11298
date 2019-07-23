package br.com.treinar;

public class EstudoMetodoVoid {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Aniversario a = new Aniversario();		
		a.fazerAniversario(p);
		a.fazerAniversario(p);
		System.out.println(p.idade);
		
		Pessoa p2 = new Pessoa("Maria Sophia");
		a.fazerAniversario(p2);
		System.out.println(p2.idade);

	}
	
}
