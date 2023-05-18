package exercicios;

import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 */
		Scanner ler = new Scanner(System.in);

		System.out.println("Qual será o tamanho dos vetores?");
		int tam = ler.nextInt();
		int[] vectA = new int[tam];
		int[] vectB = new int[tam];
		int[] vectC = new int[tam];
		
		// entrada de dados no vetor A
		System.out.println("Vetor A:");
		for (int i = 0; i < tam; i++) {
			vectA[i] = ler.nextInt();
		}

		// entrada de dados no vetor B
		System.out.println("Vetor B:");
		for (int i = 0; i < tam; i++) {
			vectB[i] = ler.nextInt();
		}
		
		//soma dos valores entre os valores
		System.out.println("soma dos valores entre os valores");
		for (int i = 0; i < tam; i++) {
			System.out.println(vectA[i] + vectB[i]);
		}
		
		
	}

}
