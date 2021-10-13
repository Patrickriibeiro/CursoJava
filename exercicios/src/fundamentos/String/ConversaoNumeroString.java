package fundamentos.String;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		 Integer a = 1000;
		 System.out.println(a.toString().length());
		 
		 int num2 = 10000;
		 System.out.println(Integer.toString(num2).length());
		 
		 System.out.println(("" + a).length());
		 System.out.println(("" + num2).length());
	}
	

}
