package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ListaDeCompras l1 = new ListaDeCompras();
		int op = -1;
		
		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Visualizar produto");
			System.out.println("3 - Ver quantidade de produtos");
			System.out.println("4 - Apagar todos os produtos");
			System.out.println("5 - Ver total da compra");
			System.out.println("0 - Sair");
			System.out.print("->");
			op = sc.nextInt();
			
			switch (op) {
			
			
			case 1:
				Produto p1 = new Produto();
				System.out.println("Digite o nome do produto: ");
				sc.nextLine();
				p1.setNome(sc.nextLine());
				do {
					System.out.println("Digite a quantidade: ");
					p1.setQuantidade(sc.nextInt());
					if(p1.getQuantidade()<=0) {
						System.out.println("Erro! Quantidade inválida.");
					}
				}while(p1.getQuantidade()<=0);
				
				
				do {
					System.out.println("Digite o valor unitario do produto.");
					p1.setValorUnitario(sc.nextDouble());
					if(p1.getValorUnitario()<=0) {
						System.out.println("Erro! Valor inválida.");
					}
				}while(p1.getValorUnitario()<=0);
								
				
				l1.adicionarProduto(p1);
				System.out.println("Cadastrado com sucesso!\n");
				break;	
				
				
			case 2:
				if (l1.getLista().isEmpty()) {
					System.out.println("Não há produtos\\n");
				}else {
					System.out.println(l1 + "\n");
				}
				break;
			
			
			case 3:
				System.out.println("Total de cadastro: " + l1.obterQuantidadeDeProdutos() + "\n");
				break;
				
			case 4:
				if (l1.getLista().isEmpty()) {
					System.out.println("Não há produtos para excluir!\n");
				}else {
					int confirma;
					System.out.println("Deseja mesmo EXCLUIR TUDO?\n1-Sim\n2-Não");
					confirma = sc.nextInt();
					if (confirma == 1) {
						l1.apagarTudo();
						System.out.println("Produtos exluídos com sucesso!\n");						
					}else {
						System.out.println("Opção cancelada.\n");
					}						
				}
				break;
			case 5:
				System.out.println("Total de lista R$ " + l1.calcularTotalDaLista() + "\n");
				break;	
				
			case 0:
				System.out.println("Sistema encerrado!\n");
				break;
				
			}
		}while( op != 0);
	}

}
