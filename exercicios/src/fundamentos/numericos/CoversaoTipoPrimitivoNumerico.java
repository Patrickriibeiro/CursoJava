package fundamentos.numericos;

public class CoversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double b = 1; //implicida
		
		System.out.println(b);
		
		float a = (float) 1.123123545; // explicita
		
		System.out.println(a);
		
		int c = 340;
		byte d = (byte) c; //explicita(CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f =  (int) e; //explicita (Cast)
		
		
		System.out.println(f);
		
		
	
}
}
