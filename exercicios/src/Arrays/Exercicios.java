package Arrays;

import java.util.Arrays;

public class Exercicios {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		//System.out.println(notasAlunoA[10]); ERRO!
		
		double totalAluno = 0;
		
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAluno += notasAlunoA[i];
			
		}
		System.out.println(totalAluno / notasAlunoA.length);
		
		double[] notasAlunosB = {6.9,6.0,5.0,8.0};
		
		double totalAlunosB = 0;
		
		for (int i = 0; i < notasAlunosB.length; i++) {
			totalAlunosB += notasAlunosB[i];
		}
		System.out.println(totalAlunosB / notasAlunosB.length);
	}

}
