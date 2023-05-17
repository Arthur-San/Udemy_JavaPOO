package udemy;

import java.util.Scanner;

public class exJogo {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Qual a hora inicial do jogo?");
		int horaEntrada = ler.nextInt();
		
		System.out.println("Qual a hora final do jogo?");
		int horaSaida = ler.nextInt();
		
		int duracao;
		
		if (horaEntrada < horaSaida) {
			duracao = horaSaida - horaEntrada;
		}else {
			duracao = 24 - horaEntrada + horaSaida;
		}
		
		
		System.out.printf("O jogo durou %d Horas", duracao);
		ler.close();
		}
		
		

	}


