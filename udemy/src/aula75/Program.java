package aula75;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = ler.nextLine();
		System.out.print("Price: ");
		double price = ler.nextDouble();
		System.out.println();
		Product product = new Product(name, price);

		product.setName("COMPUTER");
		System.out.println("atualizado nome: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("atualizado preço: " + product.getPrice());
		
		System.out.println();
		System.out.println(product);

		System.out.println();
		System.out.print("quantidade a ADICIONAR ao estoque: ");
		int quantity = ler.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Dados atualizados: \n" + product);

		System.out.println();
		System.out.print("quantidade a REMOVER do estoque: ");
		quantity = ler.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Dados atualizados: \n" + product);

		ler.close();

	}

}
