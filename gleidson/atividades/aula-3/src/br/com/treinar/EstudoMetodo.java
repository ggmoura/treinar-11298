package br.com.treinar;

import java.util.Scanner;

public class EstudoMetodo {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o primeiro numero: ");
		Integer a = teclado.nextInt();
		System.out.print("Informe o segundo numero: ");
		Integer b = teclado.nextInt();
		Integer resultado = calculadora.somar(a, b, 10);
		System.out.println("A soma de " + a + " mais " + b + " é " + resultado);
		teclado.close();
		
	}

}
