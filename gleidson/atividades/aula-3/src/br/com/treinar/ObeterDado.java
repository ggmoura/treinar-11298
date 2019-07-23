package br.com.treinar;

import java.util.Scanner;

public class ObeterDado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("O nome digitado foi: " + nome);
		teclado.close();
	}

}
