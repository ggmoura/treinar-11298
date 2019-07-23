package br.com.treinar.heranca;

import java.util.Scanner;

import br.com.treinar.heranca.pct.Pessoa;

public class Polimorfismo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 1 Mulher 2 Homem: ");
		Integer opcao = sc.nextInt();
		// remover enter deixado na leitura do inteiro
		sc.nextLine();
		// ternario
		Pessoa p = opcao == 1 ? new Mulher() : new Homem();
		System.out.print("Nome: ");
		p.setNome(sc.nextLine());
		p.respirar();

		sc.close();
	}

}
