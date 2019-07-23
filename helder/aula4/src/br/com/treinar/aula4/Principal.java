package br.com.treinar.aula4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com ano do carro: ");
		c1.setAno(teclado.nextLine());
		
		System.out.print("Entre com a marca do carro : ");
		c1.setMarca(teclado.nextLine());
		
		System.out.print("Entre com o modelo do carro : ");
		c1.setModelo(teclado.nextLine());
		
		System.out.print("Entre com o valor do carro : ");
		c1.setValor(teclado.nextDouble());
		teclado.nextLine();
		
		c1.setTipoMotor(new TipoMotor());
		
		System.out.print("Entre com a marca do motor : ");
		c1.getTipoMotor().setMarca(teclado.nextLine());
		
		System.out.print("Entre com a potencia do motor : ");
		c1.getTipoMotor().setPortencia(teclado.nextDouble());
		
		System.out.println("Ano do carro: " + c1.getAno());
		System.out.println("Marca do carro: " + c1.getMarca());
		System.out.println("Modelo do carro: " + c1.getModelo());
		System.out.println("Potencia do motor: " + c1.getTipoMotor().getPortencia());
		System.out.println("Marca do moto do carro: " + c1.getTipoMotor().getMarca());
		
		teclado.close();
	}
}
