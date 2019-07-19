package br.com.treinar.atividade;

public class AtividadeSwitch {

	public static void main(String[] args) {
		int numero = 1;
		
		switch (numero) {
		case 1:
			System.out.println("UM");
			break;
		case 2:
			System.out.println("DOIS");
			break;
		case 3:
			System.out.println("TRES");
			break;
		default:
			System.out.println("NUMERO INVALIDO");
			break;
		}

	}
}