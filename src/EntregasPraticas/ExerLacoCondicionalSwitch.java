package EntregasPraticas;

	import java.util.Scanner;

	public class ExerLacoCondicionalSwitch {

		public static void main(String[] args) {
			// Desenvolva um algoritmo em Java para uma conta bancária.
			// O programa deverá ler o tipo de operação a ser realizada com
			// base na tabela abaixo (número inteiro entre 1 e 3) e o valor
			// a ser depositado ou sacado (somente nas opções 2 e 3). Considere
			// que um saque só pode ser realizado caso haja saldo suficiente.
			// Ao final de cada operação, exiba o novo Saldo na tela. A variável
			// saldo (float), será inicializada com o valor de R$ 1000.00.
			// Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem
			// Operação Inválida!

			Scanner leia = new Scanner(System.in);
			float saldo = 1000.00f;

			System.out.println("Escolha a operação:");
			System.out.println("1. Saldo");
			System.out.println("2. Depósito");
			System.out.println("3. Saque");
			System.out.println("Digite aqui:");

			int operacao = leia.nextInt();

			switch (operacao) {
			case 1:
				System.out.println("Saldo atual: R$" + saldo);
				break;
			case 2:
				System.out.print("Digite o valor do depósito: R$");
				float deposito = leia.nextFloat();
				saldo += deposito;
				System.out.println("Novo saldo: R$" + saldo);
				break;
			case 3:
				System.out.print("Digite o valor do saque: R$");
				float saque = leia.nextFloat();
				if (saque <= saldo) {
					saldo -= saque;
					System.out.println("Novo saldo: R$" + saldo);
				} else {
					System.out.println("Saldo insuficiente para o saque.");
				}
				break;
			default:
				System.out.println("Operação inválida!");
				leia.close();
			}
		}

	}
