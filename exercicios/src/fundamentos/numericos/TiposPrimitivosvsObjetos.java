package fundamentos.numericos;

public class TiposPrimitivosvsObjetos {
	
	public static void main(String[] args) {
		
	
	
	String s = new String("texto");
	s.toUpperCase();
	
	//Wrappers s�o a vers�o objeto dos tipos
	//primitivos
	
	int a = 123;
	System.out.println(s);
    System.out.println(a);
}
}