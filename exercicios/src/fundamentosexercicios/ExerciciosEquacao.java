package fundamentosexercicios;

import java.util.Scanner;

public class ExerciciosEquacao {
	public static void main(String[] args) {
		
	
	Scanner Entrada = new Scanner(System.in);
	
	System.out.println("Equação : ax2 + bx + c = 0");
	
	System.out.println("Digite o valor A : ");
	int a = Entrada.nextInt();
	
	System.out.println("Digite o valor B : ");
	int b = Entrada.nextInt();
	
	System.out.println("Digite o valor C : ");
	int c = Entrada.nextInt();
	
	int delta = (b * b) + (4 * a * c);
	
	System.out.println(" Sua equação é : " + Math.pow(a, 2) + b + c + " =  0 ");
	
	double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	
	System.out.println("\nO x1 da equação é : " + x1);
	
	double x2 = (-b + Math.sqrt(delta)) / (2 * a);
	
	System.out.println("\nO x2 da equação é : " + x2);
	
	Entrada.close();
	}
}
