package projetoBanco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("informe o número da conta: ");
		int conta = sc.nextInt();
		System.out.print("informe o nome da conta: ");
		String nome = sc.next();	
		
		Conta c1 = new Conta(conta, nome);
		
		System.out.print("deseja fazer um depósito inicial? (s/n): ");
		String deposito = sc.next();
				

		if (deposito.equals("s")) {
			System.out.print("informe o valor do depósito incial: ");
			double valorDeposito = sc.nextDouble();
			c1.setSaldo(valorDeposito);
			System.out.println("----Cadastro Finalizado!----\n");
		} else {
			System.out.println("----Cadastro Finalizado!----\n");
		}

		System.out.print("Dados Bancários:\n" + c1 + "\n\n");

		int operacao = 0;
		do {
			System.out.println("O que deseja fazer?\n" + "1) Deposito\n" + "2) Sacar (taxa de R$ 5,00 por saque)\n" + "3) Sair");
			operacao = sc.nextInt();

			switch (operacao) {
			case 1:
				System.out.println("Insira quanto quer depositar: ");
				double valorDeposito = sc.nextDouble();
				c1.deposito(valorDeposito);
				break;

			case 2:
				System.out.println("Insira quanto quer sacar: ");
				double valorSaque = sc.nextDouble();
				c1.sacar(valorSaque);
				break;

			default:
				break;
			}
		} while (operacao != 3);

		// System.out.println(conta + " / " + nome + " / " + deposito + " / " +
		// valorDeposito);

		System.out.println("FIMM");
		sc.close();
	}

}
