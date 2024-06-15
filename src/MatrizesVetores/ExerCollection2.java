package MatrizesVetores;

import java.util.ArrayList;
import java.util.Iterator;

public class ExerCollection2 {

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<Double>();

		/*
		 * objeto da classe Wrapper double (A Classe Wrapper transforma um primitivo em
		 * Objeto e adiciona Métodos.)
		 */
		Double y = Double.valueOf(9);

		// adicionando algumas notas
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(10.0);
		notas.add(4.0);
		notas.add(6.5);

		System.out.println("\n Notas cadastradas: " + notas);

		for (Double nota : notas) {
			System.out.println(nota);
		}
		// mostra na tela todas as notas através da interface iterator
		System.out.println("\n Notas cadastradas - interface Iterator");

		Iterator<Double> iNotas = notas.iterator();

		while (iNotas.hasNext()) {
			System.out.println(iNotas.next());
		}
	}

}
