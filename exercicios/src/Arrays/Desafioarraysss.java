package Arrays;

import java.util.Scanner;

public class Desafioarraysss {
	public static void main(String[] args) {
		 Scanner Entrada = new Scanner(System.in);
		 
		 System.out.print("qual numero de notas");
		 int QuantidadesNotas = Entrada.nextInt();
		 
		 double[] notas = new double[QuantidadesNotas];
		 
		 for (int i = 0; i < notas.length; i++) {
			 System.out.println("Informe a nota " + (i + 1) + " : ");
			 notas[i] = Entrada.nextDouble();
			}
		 double total = 0;
		 for (double nota : notas) {
			 total += nota;
			
		}
		 double media = total / notas.length;
		 System.out.println("A média é " + media + "!");
		 Entrada.close();
	}

}
