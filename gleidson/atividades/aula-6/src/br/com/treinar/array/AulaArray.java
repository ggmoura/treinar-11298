package br.com.treinar.array;

import java.util.Scanner;

public class AulaArray {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vc vai perguntar a idade: ");
		Integer quantidadePessoas = sc.nextInt();
		
		Integer[] pessoas = new Integer[quantidadePessoas];
		for (int i = 0; i < pessoas.length; i++) {
			System.out.print("Informe a idade da pessoa: ");
			pessoas[i] = sc.nextInt();
		}
		System.out.println(pessoas.length);

		sc.close();
	}
	
}
