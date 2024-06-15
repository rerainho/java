package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisSwitch {

	public static void main(String[] args) {

		int opcao;
		Scanner leia = new Scanner(System.in);{

		System.out.println("#### Menu de virtudes ####");
		System.out.println("\n-- Digite 1 se sua virtude foi --");
		System.out.println("\n-- Digite 2 para escolher seu animal baseado no VIA --");
		opcao = leia.nextInt();
		// perspectiva, liderança, criatividade
		
	
		switch (opcao) {
		case 1:
			System.out.println("Sua virtude foi perspectiva");
			break;
		case 2:
			System.out.println("Seu animal foi cavalo");
			break;
		default:
			System.out.println("Opção inválida, por favor digite novamente");

		}
	}

}
}