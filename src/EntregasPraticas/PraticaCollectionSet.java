package EntregasPraticas;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class PraticaCollectionSet {

	public static void main(String[] args) {
		// Mostrar os itens encontrados e não encontradas

		Scanner sc = new Scanner(System.in);

		Set<Integer> valores = new HashSet<>(); //definição do objeto, nesse caso de um inteiro

		float y = Float.valueOf(0);

		// incluindo os números da lista
		valores.add((int) y);
		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);

		System.out.println("\n Digite qual o número deseja encontrar: " + valores);
		int numeroEscolhido = sc.nextInt(); //nextInt impressão desse inteiro

		//se
		if (valores.contains(numeroEscolhido)) { //contains retorna true (verdadeiro) do elemento da lista
			System.out.println("Número " + numeroEscolhido + " encontrado.");
		}

		//se não
		else {
			System.out.println("O número " + numeroEscolhido + " não foi encontrado.");
		}

		sc.close();
	}
}