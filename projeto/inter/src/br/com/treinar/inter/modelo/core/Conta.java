package br.com.treinar.inter.modelo.core;

public abstract class Conta {

	private Integer numeroConta;
	private Integer agencia;
	private Cliente cliente;
	private Double saldo;
	
	protected String teste;

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Conta() {
		this.saldo = 0d;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public abstract void sacar(Double valor);
	
	public Double consultarSaldo() {
		return this.saldo;
	}

}
