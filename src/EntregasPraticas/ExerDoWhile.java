package EntregasPraticas;

import java.util.Scanner;

public class ExerDoWhile {

	public static void main(String[] args) {
		// Exercício de do While soma de números positivos

		Scanner sc = new Scanner(System.in); // classes

		int positivos = 0; // variáveis 
		int numeroNeutro;
        //bloco de códigos em execução
		do {
			System.out.println("Digite um número: ");
			numeroNeutro = sc.nextInt();

			if (numeroNeutro > 0) {
				positivos = positivos + numeroNeutro; // positivo += numeroNeutro para executar sem repetir 
			}

		} while (numeroNeutro != 0);
		System.out.println("A soma dos positivos é igual a: " + positivos);

		sc.close();

	}

}