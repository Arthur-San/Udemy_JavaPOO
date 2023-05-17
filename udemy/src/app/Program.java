package app;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Program {
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.print("Valor do raio: ");
		double raio  = ler.nextDouble();
		
		double c = calc.circunferencia(raio);
		
		double v  = calc.volume(raio);
		
		System.out.printf("Circunferência: %.2f %n", c);
		System.out.printf("Volume: %.2f %n", v);
		System.out.printf("Valor do PI: %.2f %n", calc.PI);
		
		
		ler.close();
	}

	

}
