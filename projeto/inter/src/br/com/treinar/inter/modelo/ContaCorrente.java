package br.com.treinar.inter.modelo;

import br.com.treinar.inter.modelo.core.Conta;

public class ContaCorrente extends Conta {

	private Double taxaManutencao;

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public void sacar(Double valor) {
		valor += 1;
		setSaldo(getSaldo() - valor);
	}

}
