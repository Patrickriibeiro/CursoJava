package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("ana", "Lia","Bia","Gui");
		
		System.out.println("Forma tradicional...");
		for (String nome : aprovados) {
			System.out.println(nome);
			
		}
		
		System.out.println("\n Lambda 01....");
		
		aprovados.forEach((nome) -> { System.out.println(nome + "!!!");
		});
		
		System.out.println("\n Method Reference");
		aprovados.forEach(System.out::println);
		
		System.out.println("\n Lambda Reference2");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\n Method Reference2");
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi ! Meu nome � " + nome);
	}

}
