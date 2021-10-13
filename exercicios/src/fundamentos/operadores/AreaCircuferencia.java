package fundamentos.operadores;

public class AreaCircuferencia {
	 
	public static void main(String[] args) {
		double raio = 3.4;
		final double pi = 3.14; // Final transforma em constante , não pode alterar o valor depois
		
		double area = raio * raio * pi;
		
		System.out.println(area);
		
		raio = 10;
		
		area = raio * raio * pi;
		
		System.out.println(area);
			
	}

}
