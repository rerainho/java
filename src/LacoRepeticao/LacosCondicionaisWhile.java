package LacoRepeticao;

import java.util.Scanner;

public class LacosCondicionaisWhile {

	public static void main(String[] args) {
		// exemplificando o laço while

		int numero1, numero2, soma;
		char continua = 's';

		Scanner leia = new Scanner(System.in);

		while (continua != 'n')
			;
		{
			System.out.println("Digite o primeiro valor: ");
			numero1 = leia.nextInt();

			System.out.println("Digite o segundo valor: ");
			numero2 = leia.nextInt();

			soma = numero1 + numero2;

			System.out.println("O resultado da soma é: " + soma);

			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.println("\nDeseja somar dois valores?");
			System.out.println("\nDigite s para sim OU digite n para não: ");
			continua = Character.toLowerCase(leia.next().charAt(0));
			System.out.println("++++++++++++++++++++++++++++++++++");

		}
		System.out.println("Programa finalizado!");
		leia.close();
	} 

}
