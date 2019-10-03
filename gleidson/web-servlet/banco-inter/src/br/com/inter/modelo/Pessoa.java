package br.com.inter.modelo;

import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dataNascimento;
	private Boolean maiorDeIdade;
	private Integer contadorAcessos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Boolean getMaiorDeIdade() {
		return maiorDeIdade;
	}

	public void setMaiorDeIdade(Boolean maiorDeIdade) {
		this.maiorDeIdade = maiorDeIdade;
	}

	public Integer getContadorAcessos() {
		return contadorAcessos;
	}

	public void setContadorAcessos(Integer contadorAcessos) {
		this.contadorAcessos = contadorAcessos;
	}

}
