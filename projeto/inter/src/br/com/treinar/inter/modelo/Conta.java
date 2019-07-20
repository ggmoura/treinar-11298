package br.com.treinar.inter.modelo;

public class Conta {

	public Integer numeroConta;
	public Integer agencia;
	public Cliente cliente;
	public Double saldo;
	
	public Conta() {
		this.saldo = 0d;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public void sacar(Double valor) {
		saldo -= valor;
	}
	
}
