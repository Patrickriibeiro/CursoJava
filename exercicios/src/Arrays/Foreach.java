package Arrays;

public class Foreach {
	
	public static void main(String[] args) {
		 double [] Notas = { 8.0 , 9.0 , 7.0 , 6.0};
		 
		 for (int i = 0; i < Notas.length; i++) {
			System.out.println(Notas[i] + " " );
		}
		 System.out.println();
		 
		 for(double nota  : Notas) {
			 System.out.println(nota + " ");
			 
		 }
	}
	

}
