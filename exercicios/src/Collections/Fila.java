package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		
		// Diferen�a � o comportamento ocorre
		// quando a fila est� cheia !
		
		fila.add("Ana"); // retorna false
		fila.offer("Ober");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Elemente -> obter o pr�ximo elemento
		// da fila (sem remover)
		
		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia!
		
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lan�a uma null
		System.out.println(fila.element());
		
		// Poll e Remove -> obter o pr�ximo elemento
		// da fila
		
		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia !
		
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove()); // Lan�a null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)
	}

}
