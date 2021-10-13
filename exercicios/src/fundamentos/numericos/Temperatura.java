package fundamentos.numericos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		final double Fator = 5.0/9.0;
		final double ajuste = 32;
		
		double Fahrenheit = 86;
		double celsius = (Fahrenheit - ajuste) * Fator;
		
		System.out.println("O resultado é " + celsius + "graus");
		
		 Fahrenheit = 86;
		 celsius = (Fahrenheit - ajuste) * Fator;
		
	     System.out.println("O resultado é " + celsius + "graus");
	}

}
