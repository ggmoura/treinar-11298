package br.com.treinar.inter.modelo;

import br.com.treinar.inter.modelo.core.Conta;

public class ContaSalario extends Conta {

	private Integer diaDepositoSalario;

	public Integer getDiaDepositoSalario() {
		return diaDepositoSalario;
	}

	public void setDiaDepositoSalario(Integer diaDepositoSalario) {
		this.diaDepositoSalario = diaDepositoSalario;
	}

	@Override
	public void sacar(Double valor) {
		super.setSaldo(super.getSaldo() - valor);
	}

}
