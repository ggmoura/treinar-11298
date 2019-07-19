package br.com.treinar.exercicios1;

public class ExercicioClasse {

	 public static void main(String[] args) {
		
		Celular pessoal = new Celular();
		pessoal.marca = "Samsung";
		pessoal.cor = new Cor();
		pessoal.cor.cor = "Preto";
		
		System.out.println("A cor do celular " + pessoal.marca + " eh " + pessoal.cor.cor);
	}
}
