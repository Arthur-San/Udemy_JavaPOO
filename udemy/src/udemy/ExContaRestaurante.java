package udemy;

import java.util.Scanner;

public class ExContaRestaurante {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar
		 */

		Scanner ler = new Scanner(System.in);

		System.out.println("Código | Especificação   | Preço");
		System.out.println("1      | Cachorro Quente | R$ 4,00");
		System.out.println("2      | X-Salada        | R$ 4,50");
		System.out.println("3      | X-Bacon         | R$ 5,00");
		System.out.println("4      | Torrada Simples | R$ 2,00");
		System.out.println("5      | Refrigerante    | R$ 1,50");

		String[] espec = { "Cachorro quente", "X-Salada", "X-Bacon", "Torrada Simples", "Refrigerante" };
		double[] preco = { 4, 4.5, 5, 2, 1.5 };

		System.out.println("Faça seu pedido...");

		int id = ler.nextInt();
		double contaTotal = 0;

		if (id > 0 && id < 6) {
			System.out.printf("Você escolheu: %s por R$%.2f %n", espec[id - 1], preco[id - 1]);

		} else {
			System.out.println("Erro");
		}

		System.out.println("Qual a quantidade?");
		double qtd = ler.nextDouble();

		contaTotal = qtd * preco[id - 1];
		System.out.println("Total a pagar: R$" + contaTotal);

		ler.close();
	}

}
