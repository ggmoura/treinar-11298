package br.com.treinar.inter.util;

import br.com.treinar.inter.modelo.core.Conta;

public class InterRepositorio {

	private static InterRepositorio instance;
	private Conta[] contas;
	private Integer indice;
	
	static {
		instance = new InterRepositorio();
	}
	
	private InterRepositorio() {
		indice = 0;
		contas = new Conta[5];
	}

	public static InterRepositorio getInstace() {
		return instance;
	}
	
	public void adicionarConta(Conta conta) {
		contas[indice++] = conta;
	}
	
	public Conta recuperarConta(Integer indice) {
		return contas[indice];
	}
	
	public Conta[] recuperarContas() {
		Integer contador = 0;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				contador++;
			}
		}
		Conta[] preenchidas = new Conta[contador];
		for (int i = 0; i < contador; i++) {
			preenchidas[i] = contas[i];
		}
		return preenchidas.length > 0 ? preenchidas : null;
	}
	
}
