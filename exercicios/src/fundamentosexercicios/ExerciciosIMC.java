package fundamentosexercicios;

import java.util.Scanner;

public class ExerciciosIMC {
	
public static void main(String[] args) {

	Scanner Entrada = new Scanner(System.in);
	
	System.out.println("Digite seu Peso : ");
	double Peso = Entrada.nextDouble();
	
	System.out.println("Digite sua Altura : ");
	double Altura = Entrada.nextDouble();
	
	double IMC = Peso / (Altura * Altura);
	
	System.out.println("Sua Imc é : " + IMC);
	
	Entrada.close();
}	

}
