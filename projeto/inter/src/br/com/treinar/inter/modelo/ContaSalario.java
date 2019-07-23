package br.com.treinar.inter.modelo;

import br.com.treinar.inter.modelo.core.Conta;

public class ContaSalario extends Conta {

	@Override
	public void sacar(Double valor) {
		super.setSaldo(super.getSaldo() - valor);
	}

}
