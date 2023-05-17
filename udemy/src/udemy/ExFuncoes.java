package udemy;

import java.util.Scanner;

public class ExFuncoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Informe 3 números: ");
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		
		int maior = max(a , b, c);
		
		
		mostrandoResultado(maior);
		
		ler.close();

	}

	private static void mostrandoResultado(int maior) {
		System.out.println("O maior numero é: " + maior);
		
	}

	private static int max(int a, int b, int c) {
		int res;
		if (a > b && a > c) {
			res = a;
		}else if(b > c) {
			res = b;
		}else {
			res = c;
		}
		return res;
	}

}
