package br.com.treinar.inter.visao;

import java.util.Scanner;

public class TelaMenu {

	public void iniciar() {
		Scanner teclado = new Scanner(System.in);
		Integer opcao;
		do {
			System.out.println("Informe\n\t1 - Criar Conta\n\t0 - Sair");
			opcao = teclado.nextInt();
		} while (opcao != 0);
		teclado.close();
	}

}
