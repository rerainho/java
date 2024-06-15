package EntregasPraticas;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionQPratica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> clientesFila = new LinkedList<>();

		int escolha;
		do {
			System.out
					.println("\n Menu:" 
			+ "\n 1: Adicionar um novo Cliente na fila" 
			+ "\n 2: Listar todos os Clientes na fila"
			+ "\n 3: Retirar pessoa da fila"
			+ "\n 0: Sair do menu" 
			+ "\n Escolha uma opção: ");
			escolha = sc.nextInt();

			if (escolha == 1) {
				System.out.println("\nDigite o nome do cliente: ");
				sc.nextLine(); // Serve para a quebra de linha
				String nomeCliente = sc.nextLine();
				clientesFila.add(nomeCliente);
				System.out.println("Cliente " + nomeCliente + " adicionado à fila.");
			} else if (escolha == 2) {
				System.out.println("Clientes na fila: " + clientesFila);
			} else if (escolha == 3) {
				if (!clientesFila.isEmpty()) { // isEmpty indica que uma variável foi iniciada
					String clienteChamado = clientesFila.poll();
					System.out.println("Cliente " + clienteChamado + " chamado e retirado da fila.");
				} else {
					System.out.println("A fila está vazia.");
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