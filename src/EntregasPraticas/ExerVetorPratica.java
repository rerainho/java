package EntregasPraticas;

import java.util.Scanner;


public class ExerVetorPratica {

	public static void main(String[] args) {
		// 10 números inteiros não ordenados, exibir na tela a posição deste número no
		// vetor

		Scanner sc = new Scanner(System.in);

		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		System.out.println("Digite o número que deseja encontrar:");
		int paraEncontrar = sc.nextInt();

		for (int posicao = 0; posicao < vetorInteiros.length; posicao++) {
			if (vetorInteiros[posicao] == paraEncontrar) {
				paraEncontrar = posicao;
				break;
			}
		}
			if (paraEncontrar >= 0 && paraEncontrar <=10) {
				System.out.println("O número está localizado na posição: " + paraEncontrar);

			} else {
				System.out.println("O número não foi encontrado.");
			}
			sc.close();

		}
	}