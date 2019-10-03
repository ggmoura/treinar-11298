package br.com.inter.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.inter.model.TipoTelefone;

@ApplicationScoped
@ManagedBean
public class CacheController {

	private List<TipoTelefone> tiposTelefone;
	
	@PostConstruct
	private void init() {
		tiposTelefone = Arrays.asList(TipoTelefone.values());
	}

	public List<TipoTelefone> getTiposTelefone() {
		return tiposTelefone;
	}

}
