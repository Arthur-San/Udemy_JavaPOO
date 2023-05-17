package udemy;

import java.util.Scanner;

public class ExImprimirImpares {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o valor");
		int valor = ler.nextInt();
		
		for (int i = 0; i < valor; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		ler.close();
	}

}
