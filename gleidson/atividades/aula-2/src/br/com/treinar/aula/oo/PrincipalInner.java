package br.com.treinar.aula.oo;

public class PrincipalInner {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.idade = 38;
		p.endereco = new Endereco();
		p.endereco.bairro = "Gameleira";
		
		System.out.println(p.endereco.bairro);
	}

}
