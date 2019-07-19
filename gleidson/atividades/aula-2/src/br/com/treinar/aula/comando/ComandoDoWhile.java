package br.com.treinar.aula.comando;

public class ComandoDoWhile {

	public static void main(String[] args) {
		int contador = 10;
		do {
			System.out.println(contador);
			contador++;
			System.out.println("fez isso");
		} while (contador < 10);
		System.out.println("Fim do programa");
	}
}