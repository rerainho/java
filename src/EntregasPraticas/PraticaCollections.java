package EntregasPraticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PraticaCollections {

	public static void main(String[] args) {
		// apresentar lista de cores em ordem
		
		Scanner sc = new Scanner(System.in);
		
				ArrayList<String> ordemCores = new ArrayList<>();// 
				
				// Cores adicionadas

				for(int i = 0; i < 5; i++) {
					System.out.println("Digite a " + (i + 1) + "ª cor: ");
					String cores = sc.nextLine();
					ordemCores.add(cores);
					
				}
				
				
				System.out.println("\n Cores incluídas: ");
				for (String cores : ordemCores ) {
					System.out.println(cores);
				}

				Collections.sort(ordemCores);
				
				System.out.println("\n Ondem das cores: ");
				for (String cores : ordemCores) {
					if (cores != null)
						System.out.println(cores);
				}
				
				sc.close();
	}
}