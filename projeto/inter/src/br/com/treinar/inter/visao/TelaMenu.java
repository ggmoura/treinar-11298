package br.com.treinar.inter.visao;

import java.util.Scanner;

import br.com.treinar.inter.modelo.ContaCorrente;
import br.com.treinar.inter.modelo.ContaInvestimento;
import br.com.treinar.inter.modelo.ContaPoupanca;
import br.com.treinar.inter.modelo.ContaSalario;
import br.com.treinar.inter.modelo.core.Cliente;
import br.com.treinar.inter.modelo.core.Conta;
import br.com.treinar.inter.service.InterService;
import br.com.treinar.inter.util.InterRepositorio;

public class TelaMenu {

	private InterRepositorio repositorio;
	private InterService service;
	private Scanner teclado;

	public TelaMenu() {
		teclado = new Scanner(System.in);
		repositorio = InterRepositorio.getInstace();
		service = new InterService();
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
			case 5:
				consultaSaldo();
				break;
			case 6:
				alterarTaxaRendimento();
				break;
			case 7:
				aplicarRendimento();
				break;
			case 8:
				cobrarTaxaManutencao();
				break;
			default:
				if (opcao != 0) {
					System.out.println("Op��o inv�lida");
				}
				break;
			}
		} while (opcao != 0);
		teclado.close();
	}

	private void cobrarTaxaManutencao() {
		service.cobrarTaxaManutencao();
	}

	private void aplicarRendimento() {
		service.aplicarRendimento();
	}

	private void alterarTaxaRendimento() {
		System.out.println("Taxa de rendimento atual: " + ContaPoupanca.getTaxaRendimento());
		System.out.print("Informe o valor da taxa de rendimento: ");
		ContaPoupanca.setTaxaRendimento(teclado.nextInt());
		teclado.nextLine();
	}

	private void consultaSaldo() {
		Conta conta = recuperarConta();
		if (conta != null) {
			System.out.println("O saldo da conta : " + conta.consultarSaldo());
		} else {
			System.out.println("A conta n�o foi criada. Utilize a op��o 1");
		}
	}

	private void imprimirDadosConta() {
		Conta conta = recuperarConta();
		System.out.println("Numero: " + conta.getNumeroConta());
		System.out.println("Ag�ncia: " + conta.getAgencia());
		System.out.println("Nome Cliente: " + conta.getCliente().getNome());
		System.out.println("Saldo: " + conta.consultarSaldo());
	}

	private void depositar() {
		Conta conta = recuperarConta();
		System.out.print("Informe o valor a ser depositado: ");
		Double valorDepositado = teclado.nextDouble();
		conta.depositar(valorDepositado);
	}

	private void sacar() {
		Conta conta = recuperarConta();
		System.out.print("Informe o valor a ser sacado: ");
		Double valorSacado = teclado.nextDouble();
		conta.sacar(valorSacado);
	}

	private void criarConta() {
		Integer opcao;
		imprimirMenuCriarConta();
		Conta conta = null;
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
		case 4:
			conta = new ContaInvestimento();
			criarConta(conta);
			criarConta((ContaInvestimento) conta);
			break;
		default:
			System.out.println("Tipo de conta inv�lida");
			return;
		}
		repositorio.adicionarConta(conta);
	}

	private void criarConta(Conta conta) {
		System.out.print("Informe o numero da conta: ");
		conta.setNumeroConta(teclado.nextInt());
		System.out.print("Informe a ag�ncia: ");
		conta.setAgencia(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Informe o nome do Cliente: ");
		Cliente cliente = new Cliente();
		cliente.setNome(teclado.nextLine());
		conta.setCliente(cliente);
	}

	private void criarConta(ContaPoupanca contaPoupaca) {
		System.out.print("Informe o dia de anivers�rio da conta: ");
		contaPoupaca.setDiaCreditoRendimento(teclado.nextInt());
		teclado.nextLine();
	}
	
	private void criarConta(ContaInvestimento contaInvestimento) {
		System.out.print("Informe o valor da taxa de rendimento: ");
		contaInvestimento.setTaxaRendimento(teclado.nextInt());
		System.out.print("Informe o valor da taxa de manuten��o: ");
		contaInvestimento.setTaxaManutencao(teclado.nextDouble());
		teclado.nextLine();
	}

	private void criarConta(ContaCorrente contaCorrente) {
		System.out.print("Informe o valor da taxa de manuten��o: ");
		contaCorrente.setTaxaManutencao(teclado.nextDouble());
		System.out.print("Informe o valor do limite de cr�dito: ");
		contaCorrente.setLimiteCredito(teclado.nextDouble());
	}

	private void criarConta(ContaSalario contaSalario) {
		System.out.print("Informe o dia de dep�sito do sal�rio: ");
		contaSalario.setDiaDepositoSalario(teclado.nextInt());
		teclado.hasNextLine();
	}
	
	private Conta recuperarConta() {
		System.out.print("Informe o indice da conta: ");
		int indiceConta = teclado.nextInt();
		teclado.nextLine();
		return InterRepositorio.getInstace().recuperarConta(indiceConta);
	}

	private void imprimirMenuCriarConta() {
		System.out.println("Informe\n\t" 
				+ "1 - Conta Corrente\n\t" 
				+ "2 - Conta Poupan�a\n\t" 
				+ "3 - Conta Sal�rio\n\t"
				+ "4 - Conta Investimento\n\t");
	}

	private void imprimirMenuPrincipal() {
		
		System.out.print("Informe\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Imprimir dados da conta\n\t"
				+ "3 - Depositar\n\t"
				+ "4 - Sacar\n\t"
				+ "5 - Consultar Saldo\n\t"
				+ "6 - Alterar Taxa De Rendimento\n\t"
				+ "7 - Aplicar Rendimento\n\t"
				+ "8 - Cobrar Taxa De Manuten��o\n\t"
				+ "0 - Sair\n=> ");
	}

}
