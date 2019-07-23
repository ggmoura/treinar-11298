import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Loja c = new Loja();
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe produtos: ");
		c.setProdutos(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Informe nome: ");
		c.setNome(teclado.nextLine());
		System.out.print("Informe cnpj: ");
		c.setCnpj(teclado.nextInt());
		
		teclado.close();
		
		
		System.out.println(c.getNome());
		System.out.println(c.getCnpj());
		System.out.println(c.getProdutos());
		
	}
}
