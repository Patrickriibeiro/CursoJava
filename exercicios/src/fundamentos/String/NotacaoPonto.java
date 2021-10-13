package fundamentos.String;

public class NotacaoPonto {
	public static void main(String[] args) {
	String s = "bom dia ";
	s = s.toUpperCase();
	s = s.replace("X", "Senhora");
	s = s.concat("!!!!");
	
	System.out.println(s);
	
	String x = "Leo".toUpperCase();
	System.out.println(x);
	
	String y = "BOM DIA X".replace("X", "Gui").toUpperCase().concat("!!!!");
	System.out.println(y);
	
	// Tipos primitivos não tem operador "."
	int a = 3;
	System.out.println(a);
	}

}
