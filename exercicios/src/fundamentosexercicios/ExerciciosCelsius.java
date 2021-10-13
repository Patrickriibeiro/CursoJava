package fundamentosexercicios;

import java.util.Scanner;

public class ExerciciosCelsius {
	public static void main(String[] args) {
		
	
	Scanner Entrada = new Scanner(System.in);
	
	System.out.println("Digite sua temperatura em Firenhent");
	
	double Temperatura = Entrada.nextDouble();
	
	double Conversao = Temperatura * 1.8 + 32;
	
	System.out.println("valor convertido :" + Conversao);
	
	Entrada.close();
	
	
	
	}
}
