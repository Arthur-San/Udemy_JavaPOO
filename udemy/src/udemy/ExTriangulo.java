package udemy;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class ExTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("insira os valores do triangulo X");
		x.a = ler.nextDouble();
		x.b = ler.nextDouble();
		x.c = ler.nextDouble();

		System.out.println("insira os valores do triangulo Y");
		y.a = ler.nextDouble();
		y.b = ler.nextDouble();
		y.c = ler.nextDouble();
		
		
		double areaX = x.calcularArea();
		double areaY = y.calcularArea();
		
				
		System.out.printf("Área do Triangulo X: %.4f M²%n", areaX);
		System.out.printf("Área do Triangulo Y: %.4f M²%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		}else {
			System.out.println("Maior área: Y");
		}
		
		
		ler.close();
	}

}
