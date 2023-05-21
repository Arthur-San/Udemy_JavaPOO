package exercicios;

import java.util.Scanner;

public class Aluguel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão alugados?");
		int n = ler.nextInt();
		
		AluguelClass [] vect = new AluguelClass[10];
 		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nRegistro #" + i + ":");
			System.out.print("Name: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.next();
			System.out.println("Quarto: ");
			int numeroQuarto = ler.nextInt();
			
			AluguelClass al = new AluguelClass(name, email);
			
			vect[numeroQuarto] = al; 			
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		
		
		ler.close();
	}

}
