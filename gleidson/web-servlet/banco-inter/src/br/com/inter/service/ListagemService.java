package br.com.inter.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListagemService implements IComando {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse rep) {
		System.out.println("Listagem");
	}

}
