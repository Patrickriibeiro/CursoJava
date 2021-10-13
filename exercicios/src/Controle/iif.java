package Controle;

import java.util.Scanner;

public class iif {
	
	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe a média : ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Você foi aprovado");
			System.out.println("Parabens! ");
		}
		
		if(media >= 7 && media >= 4.5) {
			System.out.println("Recuperação");
			
			boolean criteriodereprovação = media < 4.5 && media >= 0;	
			
			if(criteriodereprovação) {
				System.out.println("Reprovado");
				
			}
		}
		
		
		entrada.close();
		
	}

}
