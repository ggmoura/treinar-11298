package br.com.treinar.aula1;

public class OperadorAritimetico {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int resultadoSoma = i + j;
		System.out.println("i + j = " + resultadoSoma);
		
		int resultadoSubtracao = i - j;
		System.out.println("i - j = " + resultadoSubtracao);
		
		int resultadoMultiplica = i * j;
		System.out.println("i x j = " + resultadoMultiplica) ;
		
		j = j + i;
		System.out.println("j = " +  j);
		
		i = 7;
		j = 2;
		float resultadoDivisao = i / j;
		System.out.println("i / j = " + resultadoDivisao) ;
		
		
		
		
	}
}
