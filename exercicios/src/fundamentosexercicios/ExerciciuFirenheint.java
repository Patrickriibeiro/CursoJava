package fundamentosexercicios;

import java.util.Scanner;

public class ExerciciuFirenheint {
	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Entre com seu temperatura em Celseus");
		
		double Temperatura = Entrada.nextDouble();
		
		double Convers�o = (Temperatura - 32 ) / 1.8;
		
		System.out.println("Sua temperatura em Firenhent � : " + Convers�o);
		
		Entrada.close();
	}

}
