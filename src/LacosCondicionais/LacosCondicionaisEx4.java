package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisEx4 {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		{
			{

				System.out.println("Digite a sua nota: ");
				nota1 = leia.nextFloat();

				System.out.println("Digite a segunda nota: ");
				nota2 = leia.nextFloat();

				media = (nota1 + nota2) / 2;

				if (media >= 6) {
					System.out.println("Parabéns, você foi aprovada!");
				} else {
					System.out.println("Infelizmente você foi reprovada");
				} leia.close();
			}
		}
	}
}