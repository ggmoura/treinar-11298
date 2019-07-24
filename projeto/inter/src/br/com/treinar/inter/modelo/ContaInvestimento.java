package br.com.treinar.inter.modelo;

import br.com.treinar.inter.modelo.contrato.IProdutoPagavel;
import br.com.treinar.inter.modelo.contrato.IProdutoRentavel;
import br.com.treinar.inter.modelo.core.Conta;

public class ContaInvestimento extends Conta implements IProdutoPagavel, IProdutoRentavel {

	@Override
	public void sacar(Double valor) {
		
	}

	@Override
	public void render() {
		
	}

	@Override
	public void pagar() {
		
	}

}
