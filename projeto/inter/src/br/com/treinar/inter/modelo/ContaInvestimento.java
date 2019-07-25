package br.com.treinar.inter.modelo;

import br.com.treinar.inter.modelo.contrato.IProdutoPagavel;
import br.com.treinar.inter.modelo.contrato.IProdutoRentavel;
import br.com.treinar.inter.modelo.core.Conta;

public class ContaInvestimento extends Conta implements IProdutoPagavel, IProdutoRentavel {

	private Double taxaManutencao;

	private Integer taxaRendimento;

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Integer getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Integer taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public void sacar(Double valor) {
		valor += 1;
		setSaldo(getSaldo() - valor);
	}

	@Override
	public void render() {
		Double rendimento = (taxaRendimento / 1000d);
		if (getSaldo() > 0) {
			rendimento = rendimento * getSaldo();
			depositar(rendimento);
		}
	}

	@Override
	public void pagar() {
		sacar(taxaManutencao);
	}

}
