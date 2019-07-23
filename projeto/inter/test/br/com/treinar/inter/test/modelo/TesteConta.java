package br.com.treinar.inter.test.modelo;

import br.com.treinar.inter.modelo.core.Conta;

public class TesteConta {

	static Conta c;
	
	
	public static void main(String[] args) {
		c = new Conta();
		testeDepositar();
		testeSacar();
	}

	private static void testeSacar() {
		c.sacar(50d);
		System.out.println(c.getSaldo());
	}

	private static void testeDepositar() {
		c.depositar(100d);
		System.out.println(c.getSaldo());
	}

}
