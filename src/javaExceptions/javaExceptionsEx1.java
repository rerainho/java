package javaExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class javaExceptionsEx1 {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do {
			try {
		System.out.println("Digite o Dividendo: ");
		dividendo = ler.nextInt();

		System.out.println("Digite o Divisor: ");
		divisor = ler.nextInt();

		divide(dividendo, divisor);
		
		loop =false;
	  }catch(InputMismatchException e) {
		  System.err.println("\n Exceção: " + e);
		  ler.nextLine();
		  System.out.println("\n Digite valores inteiros: ");
	  }catch(ArithmeticException e)
		  {System.err.println("\n Exceção: " + e);
		  ler.nextLine();
		  System.out.println("\n Digite valores inteiros: ");
			  
		  }finally {
			  System.out.println("\n Sempre sei executada! \n");
	  
	  }
	}while (loop);
	}
	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}