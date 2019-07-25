package br.com.treinar.inter.service;

import br.com.treinar.inter.modelo.contrato.IProdutoPagavel;
import br.com.treinar.inter.modelo.contrato.IProdutoRentavel;
import br.com.treinar.inter.modelo.core.Conta;
import br.com.treinar.inter.util.InterRepositorio;

public class InterService {

	private InterRepositorio repositorio;
	
	public InterService() {
		repositorio = InterRepositorio.getInstace();
	}
	
	public void cobrarTaxaManutencao() {
		Conta[] contas = repositorio.recuperarContas();
		for (int i = 0; i < contas.length; i++) {
			Conta conta = contas[i];
			if (conta instanceof IProdutoPagavel) {
				((IProdutoPagavel) conta).pagar();
			}
		}
	}

	public void aplicarRendimento() {
		Conta[] contas = repositorio.recuperarContas();
		for (int i = 0; i < contas.length; i++) {
			Conta conta = contas[i];
			if (conta instanceof IProdutoRentavel) {
				((IProdutoRentavel) conta).render();
			}
		}
	}

}
