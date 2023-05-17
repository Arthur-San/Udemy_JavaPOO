package udemy;

import java.util.Scanner;

public class ExValoresEntreIntervalos {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe quantos numeros verificar:");
		int tamanho = ler.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < tamanho; i++) {
			System.out.print("qual o valor?");
			int valor = ler.nextInt();
			if (valor >= 10 && valor <= 20) {
				in += 1;
			} else {
				out += 1;
			}
			
			System.out.println("Dentro: " + in);
			System.out.println("Fora: " + out + "\n");
		}
		System.out.println("FIM");

		ler.close();
	}

}
