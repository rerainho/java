package MatrizesVetores;

import java.util.ArrayList;


public class ExerCollections {

	public static void main(String[] args) {
		// Exercícioo de fixação do cookbook
		
			
		/*collection arraylist, tipo double chamada notas que terá que
		  ser encapsulada pois não aceita primitivos */
		ArrayList<Double> notas= new ArrayList<Double>();
		
		/*objeto da classe Wrapper double (A Classe Wrapper transforma um primitivo
		  em Objeto e adiciona Métodos.) */
		Double y = Double.valueOf(9);
		
		//adicionando algumas notas
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(10.0);
		notas.add(4.0);
		notas.add(6.5);
		
		System.out.println("\n Notas cadastradas: " + notas);
		
		/**
		 * Mostra a posição (índice) de uma determinada nota.
		 * Caso existam 2 notas iguais será exibida a posição de primeira nota encontrada
		 */
		
		System.out.println("\n A posição da nota 5 é: " + notas.indexOf(5d));
		
		//Mostre se uma determinada nota existe na lista
		System.out.println("\n A nota 5 existe na lista: " + notas.contains(5d));
				
		
	
	}
	

}