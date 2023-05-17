package exercicios;

import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int num = ler.nextInt();
		
		int[] numeros = new int[num];
		
		//entrada de dados
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite o numero do indice %d: ", i);
			numeros[i] = ler.nextInt();			
		}
		
		//percorrer o vetor para achar valores
		System.out.print("\nNumeros pares: ");
		int pares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				pares++;
			}
			
		}
		System.out.printf("\nQuantidade de pares: %d", pares);
		
		ler.close();
	}

}
