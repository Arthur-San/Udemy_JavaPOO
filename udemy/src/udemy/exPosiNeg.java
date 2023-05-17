package udemy;

import java.util.Scanner;

public class exPosiNeg {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não
		 */

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor");
		int valor = ler.nextInt();
		

		if (valor > 0 && valor % 2 == 0) {
			System.out.println("O valor é PAR e POSITIVO!");
			
		}else if(valor < 0 && valor % 2 == 0){
			System.out.println("O valor é PAR NEGATIVO");
			
		}else if (valor > 0 && valor % 2 != 0) {
			System.out.println("O valor é IMPAR e NEGATIVO!");	
			}		
		else if (valor < 0 && valor % 2 != 0) {
			System.out.println("O valor é IMPAR e NEGATIVO!");
			
		} else {
			System.out.println("Valor inválido!");
		}

		ler.close();

	}
}
