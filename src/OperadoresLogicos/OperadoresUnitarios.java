package OperadoresLogicos;

public class OperadoresUnitarios {

public static void main(String[] args) {
		
		int x = 10;
		int y = 8;
		int z = 6;
		int w = 4;
		int i = 40;
		int j = 30;
		int k = 20;
		int l = 10;
		int m = 5;

		System.out.println("\nTransformar em Número negativo: " + (-m));

		System.out.println("\nPré Incrementar: x = ++ y");

		x = ++ y;//8++ ==9 || 8+1 = 9 || x=9 || 9 == 9

		System.out.println("\nValor de X: " + x);// 9
		System.out.println("\nValor de Y: " + y);// 9

		System.out.println("\nPré Decrementar: z = -- w");

		z = -- w;//3

		System.out.println("\nValor de Z: " + z);
		System.out.println("\nValor de W: " + w);

		System.out.println("\nPós Incrementar: i = j ++");

		i = j ++; // i==30 j==31
		
		System.out.println("\nValor de I: " + i);
		System.out.println("\nValor de J: " + j);
		
		System.out.println("\nPós Decrementar: k = l --");

		k = l --;// k==10 l==9

		System.out.println("\nValor de K: " + k);
		System.out.println("\nValor de L: " + l);

	}
}