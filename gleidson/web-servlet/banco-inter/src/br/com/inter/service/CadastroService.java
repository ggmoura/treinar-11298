package br.com.inter.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastroService implements IComando {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse rep) {
		System.out.println("Cadastro");
	}

}
