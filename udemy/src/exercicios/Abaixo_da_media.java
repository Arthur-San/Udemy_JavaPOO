package exercicios;

import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. 
		// Em seguida, mostrar na tela a média aritmética de todos elementos com três
		// casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da
		// média, com uma casa decimal cada.
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tam = ler.nextInt();
		
		int [] vectA = new int[tam];
		
		//adicionar valores no vetor
		for (int i = 0; i < vectA.length; i++) {
			System.out.printf("Número na posição %d: ", i);
			vectA[i] = ler.nextInt();
						
		}
		
		
		
		ler.close();
	}

}
