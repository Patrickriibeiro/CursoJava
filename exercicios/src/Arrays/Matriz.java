package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Quantidade de alunos");
		int QtdAlunos = Entrada.nextInt();
		
		System.out.println("Quantidade de Notas");
		int QtdNotas = Entrada.nextInt();
		
		double[][] notasAlunos = new double[QtdAlunos][QtdNotas];
		
		double total = 0;
		
		for (int a = 0; a < notasAlunos.length; a++) {
			for (int n = 0; n < notasAlunos.length; n++) {
				System.out.println(" Informe a nota do alunos :" + (n + 1) + (a + 1));
				notasAlunos[a][n] = Entrada.nextDouble();
				
				total += notasAlunos[a][n];
			}
		}
		double media = total / (QtdAlunos * QtdNotas);
		System.out.println("Média da turma é : " + media);
		
		for (double[] ds : notasAlunos) {
			System.out.println(Arrays.toString(ds));
			
		}
		
		Entrada.close();
	}

}
