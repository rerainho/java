package optionalAplicacao;

import java.util.Optional;

public class OptionalExemplo {

	public static void main(String[] args) {
		// Aplicando o optinal para excessões
		
		String[] palavras = new String[10];
		
		Optional<String> checarNulo = Optional.ofNullable(palavras[5]);
		
		if(checarNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}else
			System.out.println("A palavra é nula.");
		
		

	}

}
