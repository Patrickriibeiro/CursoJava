package Controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);;
		
		int nota = 0;
		String conceito = "";
		
		System.out.println("Ensira uma nota");
		nota = Entrada.nextInt();
		
		switch(nota) {
			case 10 : case 9:
				conceito = "A";
				break;
			case 8: case 7:
				conceito = "B";
				break;
			case 6: case 5:
				conceito = "C";
			case 4: case 3:
				conceito = "D";
				break;
		   default:
			   System.out.print("Não aceitando essa nota");
				
	}
		
		System.out.println("Conceito é " + conceito);
		Entrada.close();

}
}