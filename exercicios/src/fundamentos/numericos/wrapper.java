package fundamentos.numericos;

public class wrapper {
	
	public static void main(String[] args) {
		
		// byte 
		
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.next());
		Integer i = 10000;
		Long l = 10000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.shortValue());
		System.out.print(i * 3);
		System.out.print(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.4567;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toLowerCase());
		System.out.println(bo);
		
		Character c = '#'; // char
		
		System.out.println(c);
		
		
	}

}
