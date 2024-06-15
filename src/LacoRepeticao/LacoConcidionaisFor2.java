package LacoRepeticao;

import java.util.Scanner;

public class LacoConcidionaisFor2 {

	public static void main(String[] args) {
		String nome;
		int contador;
		try (Scanner sc = new Scanner(System.in)) {
			for(contador = 1; contador < 4 ; contador++) {
				System.out.println("\nDigite o " + contador + "º nome: ");
				nome = sc.nextLine();
				System.out.println("O contador " + contador + "º nome: " + nome);
			}sc.close();
		}

	}

}