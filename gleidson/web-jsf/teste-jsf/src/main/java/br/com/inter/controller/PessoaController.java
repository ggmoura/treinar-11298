package br.com.inter.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.inter.model.Pessoa;

@ManagedBean
@ViewScoped
public class PessoaController {

	private Pessoa pessoa;

	@PostConstruct
	private void init() {
		pessoa = new Pessoa();
		pessoa.setNome("Maria Sophia");
		try {
			pessoa.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("15/11/2012"));
		} catch (ParseException e) {
			System.out.println("NAO FOI POSSIVEL ATRIBUIR A DATA DE NASCIMENTO");
		}
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String alterarNome() {
		System.out.println(this.pessoa.getNome());
		return "";
	}

}
