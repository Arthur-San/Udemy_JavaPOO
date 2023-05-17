package aula88;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// vetores - são arranjos unidimensionais
		//fazer um programa para ler um numero inteiro e altura de N pessoas. armazene as N alturas em um vetor.
		//em seguida, mostrar a altura média dessas pessoas
		
		Scanner sc = new Scanner(System.in);

		System.out.println("informe quantas alturas deseja inserir: ");
		int numero = sc.nextInt();
		
		double[] vect = new double[numero];
		
		//looping para percorrer a quantidade de entradas
		for (int i = 0; i < numero; i++) {
			System.out.println("informe a altura: ");
			vect[i] = sc.nextDouble();
		}
		
		//somar valores dentro do vetor
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];			
		}
		
		double media = soma / numero;
		System.out.println("\nMédia: "  + media);
		
		
		
		
		sc.close();
	}

}
