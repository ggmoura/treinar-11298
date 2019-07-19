package br.com.treinar.exercicios1;

public class ExercicioIf {
	public static void main(String[] args) {
		int numero = 2;

		if (numero == 1) {
			System.out.println("Nosso numero eh um");
		} else if (numero == 2) {
			System.out.println("Nosso numero eh dois");
		} else if (numero == 3) {
			System.out.println("Nosso numero eh tres");
		} else if (numero < 1 | numero > 3) {
			System.out.println("Numero invalido");
		}
	}
}
