package Controle;

import java.util.Scanner;

public class DoWhile {

	
	public static void main(String[] args) {
	Scanner Entrada = new Scanner(System.in);
	
	String Texto = "";
	
	do {
		System.out.println("Digite a palavra Magica " + 
	  "\nDigite a palavra " + "'Sair'" );
		Texto = Entrada.nextLine();
	
	
      }while(!Texto.equalsIgnoreCase("Sair"));

	System.out.println("Obrigado");
	
	Entrada.close();
	}
	
}
