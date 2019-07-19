package br.com.atividade1.atividade1;

public class CalculoHora {
	public static void main(String[] args) {
		int minutosTotais = 122;
		int horas = 0;
		int minutos = 0;
		horas = minutosTotais /60;
		minutos = minutosTotais % 60;
		System.out.println("Minutos totais: "+ minutosTotais + " em horas: "+ horas+ " minutos: "+ minutos);
	}

}
