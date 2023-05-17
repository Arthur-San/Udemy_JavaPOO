package util;

public class Calculadora {
	public  final double PI = 3.14159;
	
	public double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}

	public double circunferencia(double raio) {
		return 2 * PI * raio;
	}
}
