package udemy;

import java.util.Scanner;

//import java.util.Scanner;

public class exIntervalos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int valores = Integer.MAX_VALUE;
		
		
		System.out.println("Digite 0 para sair \n");
		while ( valores != 0) {
			System.out.println("Digite um número: ");
			valores = ler.nextInt();
			System.out.println("Valor inserido: " + valores + "\n");
		}
		System.out.println("FIM");
		
		
		ler.close();
	}
}
