package udemy;

import java.util.Scanner;

public class ExSenhaValida {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */
		Scanner ler = new Scanner(System.in);

		int senha = Integer.MAX_VALUE;

		while (senha != 2002) {
			System.out.println("Informe a senha:");
			senha = ler.nextInt();

			if (senha == 2002) {
				System.out.println("Acesso Permitido");
			} else {
				System.out.println("Acesso negado!");
			}
		}

		ler.close();
	}

}
