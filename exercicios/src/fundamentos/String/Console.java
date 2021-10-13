package fundamentos.String;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia !!");
		
		System.out.println("Bom");
		System.out.println("dia !!");
		
		System.out.printf("MegaSena %d" , 1);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome :");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua idade :");
		int idade = entrada.nextInt();
		
		
		System.out.println("Nome :"+ nome + "idade :" + idade);
		
		entrada.close();
	}

}
