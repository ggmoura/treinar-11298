package br.com.treinar.aula.operador;

public class OperadorAritimetico {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println("i = " + i + "; j = " + j);
		int resultadoSoma = i + j;
		System.out.println("i + j = " + resultadoSoma);
		int resultadoSubtracao = i - j;
		System.out.println("i + j = " + resultadoSubtracao);
		j = j + i;
		System.out.println("j = " + j);
		
		i = 5;
		j = 2;
		int resultadoDivisao = i / j;
		System.out.println("Resultado Divisao: " + resultadoDivisao);
		
		double salario = 10000;
		int qtdPessoas = 3;
		
		System.out.println(salario / qtdPessoas);
		
		System.out.println("Multiplicação: " + (i * j));
		
		System.out.println("Modulo entre 66 e 60: " + 66 % 60);
	}

}
