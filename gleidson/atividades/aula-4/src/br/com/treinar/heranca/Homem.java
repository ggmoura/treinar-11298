package br.com.treinar.heranca;

import br.com.treinar.heranca.pct.Pessoa;

public class Homem extends Pessoa {

	private String barba;

	public String getBarba() {
		return barba;
	}

	public void setBarba(String barba) {
		this.barba = barba;
	}

	@Override
	public void respirar() {
		super.respirar();
		System.out.println(" E tenho barba");
	}

}
