package Collections;

import java.util.HashSet;
import java.util.Set;
//import java.util.Scanner;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("TESTE");
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("TESTE"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}