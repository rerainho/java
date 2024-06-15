package EntregasPraticas;

import java.util.Scanner;
import java.util.Stack;

public class CollectionSPratica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> pilhaLivros = new Stack<>();

		int escolha;
		do {
			System.out.println("\n Menu:"
		    +"\n 1: Adicionar um novo livro na pilha"
			+"\n 2: Listar todos os livros da pilha"
			+"\n 3: Retirar um livro da pilha"
			+"\n 0: Sair do menu"
			+"\n Escolha uma opção: ");
			escolha = sc.nextInt();

			if (escolha == 1) {
				System.out.println("\nDigite o nome do livro: ");
				sc.nextLine(); 
				String nomeLivro = sc.nextLine();//retorna a informação para a linha seguinte
				pilhaLivros.push(nomeLivro);//empurra a informação da pilha 
				System.out.println("Livro \"" + nomeLivro + "\" adicionado à pilha.");
			} else if (escolha == 2) {
				System.out.println("Livros na pilha: " + pilhaLivros);
			} else if (escolha == 3) {
				if (!pilhaLivros.isEmpty()) { //avisa que a variável iniciou
					String livroRetirado = pilhaLivros.pop();//pop serve para retirar o elemento do topo da pilha
					System.out.println("Livro \"" + livroRetirado + "\" retirado da pilha.");
				} else {
					System.out.println("A pilha está vazia.");
				}
			} else if (escolha == 0) {
				System.out.println("Programa finalizado.");
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (escolha != 0);

		sc.close();
	}
}