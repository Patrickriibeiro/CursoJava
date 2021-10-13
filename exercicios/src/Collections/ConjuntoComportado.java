package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//Set<String> listaAprovadors = new HashSet<>();
		SortedSet<String> ListaAprovados = new TreeSet();
		
		ListaAprovados.add("Ana");
		ListaAprovados.add("Carlos");
		ListaAprovados.add("Luca");
		ListaAprovados.add("Pedro");
		
		for (String candidato : ListaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (Integer n : nums) {
			System.out.println(n);
			
		}
		
	}

}
