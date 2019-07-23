package br.com.treinar.aula.comando;

public class ComandoSwitch {

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