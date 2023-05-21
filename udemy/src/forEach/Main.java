package forEach;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		String [] vect = new String[n];
		
		//inserir dados no vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o valor na posição %d: ", i);
			vect[i] = sc.next();			
		}
		
		//contar elementos no vetor
		//forma de ler: para cara objeto string, contido no vetor vect, faça:
		for (String string : vect) {
			System.out.println(string);
		}
  
	}

}
