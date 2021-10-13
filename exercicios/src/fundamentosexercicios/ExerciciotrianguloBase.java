package fundamentosexercicios;

import java.util.Scanner;

public class ExerciciotrianguloBase {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Digite a base");
		double valorBase = Entrada.nextDouble();
		
		System.out.println("Digite a Altura");
		double valorAltura = Entrada.nextDouble();
		
		double CalculoArea = (valorBase * valorAltura) / 2;
		
		System.out.println("Valor da area é :" + CalculoArea);
		
		Entrada.close();
		
	}

}
