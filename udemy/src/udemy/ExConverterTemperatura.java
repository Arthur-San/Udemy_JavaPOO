package udemy;

import java.util.Locale;
import java.util.Scanner;

public class ExConverterTemperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = ler.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f %n", F);
			
			System.out.print("Deseja repetir (S/N) ? ");
			resp = ler.next().charAt(0);
		} while (resp != 'n');
		
		System.out.println("FIM");
		
		
		
		
		ler.close();
	}

}
