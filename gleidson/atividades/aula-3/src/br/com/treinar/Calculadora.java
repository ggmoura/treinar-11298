package br.com.treinar;

public class Calculadora {

	Integer somar(Integer x, Integer y) {
		Integer resultadoSoma = x + y;
		return resultadoSoma;
	}
	
	Integer somar(Integer x, Integer y, Integer z) {
		Integer resultadoSoma = somar(x, y) + z;
		return resultadoSoma;
	}
	
}
