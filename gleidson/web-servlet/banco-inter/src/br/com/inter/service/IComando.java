package br.com.inter.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IComando {

	void executar(HttpServletRequest req, HttpServletResponse rep);
	
}
