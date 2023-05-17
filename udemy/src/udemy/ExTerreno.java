package udemy;

import java.util.Scanner;
import java.util.Locale;

public class ExTerreno {

	public static void main(String[] args) {
		// Fazer um programa para ler as medidas da largura e comprimento de umterreno
		// retangular com uma casa decimal, valor do metro² do terreno com duas casas
		// decimais. em seguida, o programa deve mostrar o valor da área do terreno, o
		// valor do preço do terreno, ambos com duas casas decimais
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a largura?");
		double largura = ler.nextDouble();
		
		System.out.println("Qual o comprimento?");
		double comprimento = ler.nextDouble();
		
		System.out.println("Qual o valor do Metro por Quadrado?");
		double valorMetro = ler.nextDouble();
		
		double areaTerreno = comprimento * largura;		
		double precoTerreno = areaTerreno * valorMetro;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("A área do terreno é %.2f M² %n", areaTerreno);
		System.out.printf("O preço do terreno é R$%.2f", precoTerreno);
		
		
				
		ler.close();
	}

}
