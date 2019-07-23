package br.com.treinar.inter.modelo;

import br.com.treinar.inter.modelo.core.Conta;

public class ContaPoupanca extends Conta {

	private Integer taxaRendimento;

	public Integer getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Integer taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public void sacar(Double valor) {
		super.setSaldo(super.getSaldo() - valor);
	}

}
