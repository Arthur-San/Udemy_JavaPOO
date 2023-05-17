package udemy;

import java.util.Scanner;

public class ExDiferencaProdut {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia 
		 * o número de um funcionário, 
		 * seu número de horas trabalhadas, 
		 * o valor que recebe por hora 
		 * e calcula o salário desse funcionário. 
		 * A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("ID do funcionário:");
		int idFuncionario = ler.nextInt();
		
		System.out.println("Horas trabalhadas: ");
		double horasTrabalhadas = ler.nextDouble();
		
		System.out.println("Valor por hora: ");
		double valorHora = ler.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		System.out.printf("Funcionario: %d %nSalario: R$ %.2f", idFuncionario, salario);
		
		
		
		
		
		
		
		ler.close();
	}

}
