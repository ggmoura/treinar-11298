package br.com.treinar.exercicios1;

public class CriarObjetos {

	public static void main(String[] args) {

		Celular celPessoal;
		celPessoal = new Celular();
		celPessoal.marca = "Iphone";

		System.out.println(celPessoal.marca);

		Celular celCorporativo;
		celCorporativo = new Celular();
		celCorporativo.tamanho = 20;

		System.out.println(celCorporativo.tamanho);
	}
}
