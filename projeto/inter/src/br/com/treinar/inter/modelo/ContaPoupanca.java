package br.com.treinar.inter.modelo;

import br.com.treinar.inter.modelo.contrato.IProdutoRentavel;
import br.com.treinar.inter.modelo.core.Conta;

public class ContaPoupanca extends Conta implements IProdutoRentavel {

	private Integer diaCreditoRendimento;
	private static Integer taxaRendimento;

	static {
		taxaRendimento = 0;
	}

	public static Integer getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Integer taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	@Override
	public void sacar(Double valor) {
		super.setSaldo(super.getSaldo() - valor);
	}

	public Integer getDiaCreditoRendimento() {
		return diaCreditoRendimento;
	}

	public void setDiaCreditoRendimento(Integer diaCreditoRendimento) {
		this.diaCreditoRendimento = diaCreditoRendimento;
	}

	@Override
	public void render() {
		Double rendimento = (taxaRendimento / 1000) * getSaldo();
		depositar(rendimento);
	}
}
