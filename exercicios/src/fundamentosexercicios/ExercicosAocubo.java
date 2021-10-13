package fundamentosexercicios;

import java.util.Scanner;

public class ExercicosAocubo {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Digite uma valor");
		double valor = Entrada.nextDouble();
		
		double resultadoQuadrado = Math.pow(valor, 2);
		double resultadoCubo = Math.pow(valor, 3);
		
		System.out.printf("O valor é quadrado é :" + resultadoQuadrado + " \nresultado do Cubo : " + resultadoCubo);
		Entrada.close();
	}

}
