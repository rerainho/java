package OperadoresLogicos;

public class OperadoresAtribuicao {


	public static void main(String[] args) {
		
		int x = 4;
		int y = 2;
		int z = 1;//2 o z se transforma embaixo pois z está sendo incrementado por y

		z = y;
		System.out.println("Atribuição simples (z = y): " + z);//2

		x += y;
		System.out.println("\nAtribuição com soma (x = x + y): " + x);// 6

		x -= z;
		System.out.println("\nAtribuição com subtração (x = x - z): " + x); //4

		x *= y;
		System.out.println("\nAtribuição com multiplicação (x = x * y): " + x);//8

		x /= y;
		System.out.println("\nAtribuição com divisão (x = x / y): " + x);//4

        x %= y;
        System.out.println("\nAtribuição com o Módulo (x = x % y): " + x);//0
        
	}
}