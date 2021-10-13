package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		
		String Texto = "";
		
		while(!Texto.equalsIgnoreCase("Sair")) {
			System.out.println("Ainda não sai otario , palavra chave errada  :" + Texto );
			Texto = Entrada.nextLine();
			
		}
		Entrada.close();
	}
}
