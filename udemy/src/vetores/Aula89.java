package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula89 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe a quantidade de itens a serem analisados: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("nome: ");
			String name = sc.nextLine();
			System.out.print("preço: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);			
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i].getPrice();			
		}
		
		double media = soma / n;
		System.out.printf("\nMédia de preços: %.2f", media);
		
		sc.close();
	}

}
