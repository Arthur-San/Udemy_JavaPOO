package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("informe o produto para adicionar");
		System.out.print("Name: ");
		product.name = ler.nextLine();
		
		System.out.print("Price: ");
		product.price = ler.nextDouble();
		
		System.out.print("Quantidade: ");
		product.quantity = ler.nextInt();
		
		
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
