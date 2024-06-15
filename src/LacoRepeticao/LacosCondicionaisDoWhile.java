package LacoRepeticao;

import java.util.Scanner;

public class LacosCondicionaisDoWhile {

	public static void main(String[] args) {
		// Nesse "do while" a condição lógica é apenas no final
		int numero, resultado, contador = 3;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("/n Digite um número inteiro: ");//1
			numero = sc.nextInt();// número 1
			
			resultado = numero * 5; // resultado = 5
			
			System.out.println("n/ O resultado da multiplicação é: " + resultado);// 5
			contador--;
			
		}while(contador <=2); // 3 < = 2
sc.close();
	}

}