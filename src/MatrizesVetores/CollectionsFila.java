package MatrizesVetores;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionsFila {

	public static void main(String[] args) {
		// Exemplo de fila para entendimento dessa collections de dados estruturados
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i = 0; i < 10; i++)
			fila.add(i);
		
		System.out.println("\n Elementos da fila: " + fila);
		System.out.println("\n Remove um elemento na fila: " + fila.remove()); //"0"
		System.out.println("\n Novos elementos na fila: " + fila);
		System.out.println("\n Elemento 11  adicionado na fila: " + fila.add(11));
		System.out.println("\n Novos elementos na fila: " + fila);
		System.out.println("\n primeiro elemento da fila: " + fila.peek());
		System.out.println("\n Verificar tamamho da fila: " + fila.size());
		System.out.println("\n checar se o elemento 5 está na fila: " + fila.contains(5));
		System.out.println("\n Exibir e excluir o primeiro elemento (head): \n" + fila.poll());
		
        Iterator<Integer> iterator = fila.iterator();
		
		while(iterator.hasNext()){
		   System.out.println(iterator.next());
		}

		System.out.println("\n Limpar a fila");
		fila.clear();

		System.out.println("\n A fila está vazia? " + fila.isEmpty());		

	}

}