package MatrizesVetores;

import java.util.Scanner;

public class ExercicioVetores2 {

	public static void main(String[] args) {
		// Aplicação de vetores vazios, onde ao na entrada digitar o conteúdo terá uma posição

		Scanner sc = new Scanner(System.in);
		int vetorInteiro[] = new int[5];

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º número: ");
			vetorInteiro[indice] = sc.nextInt();
		}
		System.out.println("Os núemros digitados foram: \n");

		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º número " + vetorInteiro[indice]);
		}

		sc.close();
	}

}