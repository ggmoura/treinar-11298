package br.com.treinar.inter.visao;

import java.util.Scanner;

import br.com.treinar.inter.modelo.ContaCorrente;
import br.com.treinar.inter.modelo.ContaPoupanca;
import br.com.treinar.inter.modelo.ContaSalario;
import br.com.treinar.inter.modelo.core.Cliente;
import br.com.treinar.inter.modelo.core.Conta;

public class TelaMenu {

	Conta conta;
	Scanner teclado;

	public TelaMenu() {
		teclado = new Scanner(System.in);
	}

	public void iniciarMenu() {
		Integer opcao;
		do {
			imprimirMenuPrincipal();
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				criarConta();
				break;
			case 2:
				imprimirDadosConta();
				break;
			case 3:
				depositar();
				break;
			case 4:
				sacar();
				break;
			default:
				if (opcao != 0) {
					System.out.println("Opção inválida");
				}
				break;
			}
		} while (opcao != 0);
		teclado.close();
	}

	private void imprimirDadosConta() {
		System.out.println("Numero: " + conta.getNumeroConta());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Nome Cliente: " + conta.getCliente().getNome());
		System.out.println("Saldo: " + conta.getSaldo());
	}

	private void depositar() {
		System.out.print("Informe o valor a ser depositado: ");
		Double valorDepositado = teclado.nextDouble();
		conta.depositar(valorDepositado);
	}

	private void sacar() {
		System.out.print("Informe o valor a ser sacado: ");
		Double valorSacado = teclado.nextDouble();
		conta.sacar(valorSacado);
	}

	private void criarConta() {
		Integer opcao;
		imprimirMenuCriarConta();
		conta = null;
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			conta = new ContaCorrente();
			criarConta(conta);
			criarConta((ContaCorrente) conta);
			break;
		case 2:
			conta = new ContaPoupanca();
			criarConta(conta);
			criarConta((ContaPoupanca) conta);
			break;
		case 3:
			conta = new ContaSalario();
			criarConta(conta);
			criarConta((ContaSalario) conta);
			break;
		default:
			System.out.println("Tipo de conta inválida");
			return;
		}
	}

	private void criarConta(Conta conta) {
		System.out.print("Informe o numero da conta: ");
		conta.setNumeroConta(teclado.nextInt());
		System.out.print("Informe a agência: ");
		conta.setAgencia(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Informe o nome do Cliente: ");
		Cliente cliente = new Cliente();
		cliente.setNome(teclado.nextLine());
		conta.setCliente(cliente);
	}

	private void criarConta(ContaPoupanca contaPoupaca) {
		System.out.println("Terminar cadastro conta poupança");
	}

	private void criarConta(ContaCorrente contaCorrente) {
		System.out.println("Terminar cadastro conta corrente");
	}

	private void criarConta(ContaSalario contaSalario) {
		System.out.println("Terminar cadastro conta salario");
	}

	private void imprimirMenuCriarConta() {
		System.out
				.println("Informe\n\t" + "1 - Conta Corrente\n\t" + "2 - Conta Poupança\n\t" + "3 - Conta Salário\n\t");
	}

	private void imprimirMenuPrincipal() {
		System.out.println("Informe\n\t" + "1 - Criar Conta\n\t" + "2 - Imprimir dados da conta\n\t"
				+ "3 - Depositar\n\t" + "4 - Sacar\n\t" + "0 - Sair");
	}

}
