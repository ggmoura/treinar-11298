package br.com.treinar.inter.modelo;

import br.com.treinar.inter.modelo.core.Conta;

public class ContaCorrente extends Conta {

	private Double taxaManutencao;
	private Double limiteCredito;

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public void sacar(Double valor) {
		valor += 1;
		setSaldo(getSaldo() - valor);
	}
	
	@Override
	public Double consultarSaldo() {
		Double saldo = super.consultarSaldo();
		return saldo + limiteCredito;
	}

}
