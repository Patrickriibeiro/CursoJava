package Controle;

import java.util.Scanner;

public class iif {
	
	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe a m�dia : ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Voc� foi aprovado");
			System.out.println("Parabens! ");
		}
		
		if(media >= 7 && media >= 4.5) {
			System.out.println("Recupera��o");
			
			boolean criteriodereprova��o = media < 4.5 && media >= 0;	
			
			if(criteriodereprova��o) {
				System.out.println("Reprovado");
				
			}
		}
		
		
		entrada.close();
		
	}

}
