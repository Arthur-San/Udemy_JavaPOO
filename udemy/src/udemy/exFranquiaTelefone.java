package udemy;

import java.util.Scanner;

public class exFranquiaTelefone {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int minutos = ler.nextInt();
		
		double conta = 50;
		
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		
		ler.close();

	}

}
