package br.com.treinar.aula.operador;

public class IncrementoDecremento {

	public static void main(String[] args) {
		int i = 10;
		System.out.println("i = " + i);
		i = i + 1;
		System.out.println("i = " + i);
		i += 1;
		System.out.println("i = " + i);
		i++;
		System.out.println("i = " + i);
		int j = i++;
		System.out.println(j);
		System.out.println(i);
		
		int h = ++i;
		
		System.out.println(h);
		System.out.println(h++);
		System.out.println(h);
	}

}
