package br.com.treinar.OO.atividade1;

public class Principal {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		carro1.marca = "Fiat";
		carro1.cor = "Vermelho";
		carro1.pre�o = 50000;
		carro1.tipoMotor = new TipoMotor();
	
		carro1.tipoMotor.linha = "V8";
		carro1.tipoMotor.potencia = 220;

		Carro carro2 = new Carro();
		carro2.marca = "honda";
		carro2.cor = "Preto";
		carro2.pre�o = 60000;

		Carro carro3 = new Carro();
		carro3.marca = "Ford";
		carro3.cor = "Azul";
		carro3.pre�o = 70000;

		System.out.println("Carro da marca " + carro1.marca + " da cor " + carro1.cor + " custa R$ " + carro1.pre�o + " com potencia de " + carro1.tipoMotor.potencia);
		System.out.println("Carro da marca " + carro2.marca + " da cor " + carro2.cor + " custa R$ " + carro2.pre�o);
		System.out.println("Carro da marca " + carro3.marca + " da cor " + carro3.cor + " custa R$ " + carro3.pre�o);

	}

}
