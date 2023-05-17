package udemy;

import java.util.Scanner;

public class ExRaio {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 */

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor do raio?");
		double raio = ler.nextDouble();
		
		double pi = 3.14159;
		double calcularArea = pi * (Math.pow(raio, 2));
		
		System.out.printf("valor da área do cículo: %.4f", calcularArea);
		
		ler.close();
	}

}
