package EntregasPraticas;

import java.util.Scanner;

public class ExerLacoFor {

	public static void main(String[] args) {
		// Na tela tem que constar quantos são números pares e ímpares
		
		int impares = 0; // int representa a qtd.
		int pares = 0; 
		Scanner sc = new Scanner(System.in);

		System.out.print("Quer saber o total de pares e ímpares?");
		for (int i = 1; i <= 10; i++) {// o i++ é para incrementar a variável, se não ela fica "sozinha"
			System.out.println("\nEntão Digite o " + i + "º número: ");
			int paresImpares = sc.nextInt();

			if (paresImpares % 2 == 0) {// o símbolo == é sempre um comparativo então tudo que for na divisão igual a 0 equivale a números pares
				pares++; // então tudo que for diferente de zero vai ser considerado ímpar, ai entra na condição else
			} else {
				impares++; // o i++ é para aprecer a contagem e não o valor em sí, pois o valor está no if com a operação
			}

		}
		System.out.print("\nQuantidade total:");
		System.out.println("\nNúmeros pares: " + pares);
		System.out.println("Números ímpares: " + impares);
		
		sc.close();

	}
}