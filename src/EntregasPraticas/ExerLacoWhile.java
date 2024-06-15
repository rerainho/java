package EntregasPraticas;

import java.util.Scanner;

public class ExerLacoWhile {

	public static void main(String[] args) {
		// Exercício para saber o total de idades

		Scanner sc = new Scanner(System.in);

		int idadeMenor = 0;
		int idadeMaior = 0;
		int idade = 0;

		while (idade >= 0) {// enquanto a idade...
			System.out.println("Digite a sua idade abaixo: ");
			idade = sc.nextInt();

			if (idade >= 0 && idade < 21) {
				idadeMenor++;

			}

			if (idade > 50) {
				idadeMaior++;

			}

		}
		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaior);

		sc.close();

	}

}
