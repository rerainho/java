package MatrizesVetores;

	import java.util.HashSet;
	import java.util.Set;


	public class CollectionsEx3 {

		public static void main(String[] args) {
			// Agora exemplo com string e com mais utilidades da biblioteca

			Set<String> setFrutas = new HashSet<String>();// esse hashset não repete elementos

			// Algumas frutas adicionadas

			setFrutas.add("Pêra");
			setFrutas.add("Maçã");
			setFrutas.add("Kiwi");
			setFrutas.add("Laranja");
			setFrutas.add("Kiwi");

			System.out.println("\n Dados da Colletion: " + setFrutas);

			System.out.println("\n Existe a fruta Kiwi? " + setFrutas.contains("Kiwi"));

			setFrutas.remove("Kiwi");
			System.out.println("\n Kiwi foi removido");

			System.out.println("\n Existe a fruta Kiwi? " + setFrutas.contains("Kiwi"));

			System.out.println("\n Listar todos os elementos com o laço For. .Each");

			for (String fruta : setFrutas) {
				if (fruta != null)
					System.out.println("o hashcode do elemento " + fruta + " é " + fruta.hashCode());
			}
			System.out.println("\n Listar todos os Elementos com o Interetor");
				
			

		}

	}
