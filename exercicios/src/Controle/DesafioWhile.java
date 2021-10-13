package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int QuantidadesdeNotas = 0;
		double nota = 0;
		double total= 0;
		
		while (nota != -1) {
			System.out.println("Digite sua nota : " + "Para sair digite 'Sair' ");
			nota = Entrada.nextDouble();
			if(nota <= 10 && nota >= 0) {
				total += nota ;
				QuantidadesdeNotas++;
			}else {
				System.out.println("Digite uma nota valida");
			}
			
			 double media = total / QuantidadesdeNotas;
			
			System.out.println("sua média é = " + media);
		}
		
		Entrada.close();
	}

}
