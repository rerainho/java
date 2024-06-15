package EntregasPraticas;

import java.util.Scanner;

public class ExerLacosCondicionais {

	public static void main(String[] args) {

		String nome;
		int idade;
		boolean doacao;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o nome seu nome: ");
		nome = leia.nextLine();

		System.out.print("Qual a sua idade? ");
		idade = leia.nextInt();

		System.out.print("É a primeira doação? \nDigite true para sim ou false para não: ");
		doacao = leia.nextBoolean();

		if (idade >= 18 && idade <= 69) {
						if (idade >= 60 && doacao) {
				System.out.println(nome + " não está apto para doar.");
			} else {
				System.out.println(nome + " está apto para doar.");
			}
		} else {
			System.out.println(nome + " não está apto para doar sangue.");
			leia.close();
		}
	}
}