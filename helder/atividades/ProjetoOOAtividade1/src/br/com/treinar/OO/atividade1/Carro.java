package br.com.treinar.OO.atividade1;

public class Carro {

	int preço;
	int tamanho;
	String cor;
	String marca;
	TipoMotor tipoMotor;

	void acelerar() {
		System.out.println("Acelerando");
	}

	void freiar() {
		System.out.println("Freiando");
	}

	void bunziar() {
		System.out.println("Buzinando");
	}
}
